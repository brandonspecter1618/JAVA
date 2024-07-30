import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class jsTestDB {
	
	public static void main(String args[]){
		connDB();
	};

    public static Connection connDB() {
    	Scanner scan = new Scanner(System.in);
    	
    	//Variáveis utilizada para incluir dados no DB
		String nome  = "Brandon";
		String email = "brandon@gmail.com";
		int    age   = 29;
		
		//Variáveis utilizada para conexão com o DB
                String url = "jdbc:sql://127.0.0.1:3306/db_alunos";
		String username = "root";
		String password = "22091992";
		
		//Variáveis utilizada para excluir no DB via id.
		int    id    = 11;
		
		//Variável utilizada como condicionamento em IF's para mostrarDB, incluirDB, excluirDB
	    	//Sendo esses nomes sugeridos para um value em um input dentro do HTML
		String inp		= "";
		
		//Variáveis utilizada para armazenar comando query via DB
		String querySelect  = "select id_alunos, nome, email, age from alunos";
		String queryInsert  = "insert into alunos(nome, email, age) values(?, ?, ?)";
		String queryExclude = "delete from alunos WHERE id_alunos = ?";
		
		//Variáveis utilizada como atributos para conexão com o banco
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
        
        try {     	
		//Carregamento do Driver responsável pela conexão
        	Class.forName("com.mysql.jdbc.Driver");
		
		//Conexão responsável por enviar os dados através do drive para o banco
            	conn = DriverManager.getConnection(url, username, password);  
		
		//Condicionamento para uma conexão
            	if(conn != null) {
            		System.out.println("Conectado com sucesso!");
            	}else {
            		System.out.println("Não foi possivel realizar conexão");
            	}
            	
		//Condicionamento a partir de uma entrada dada pelo usuário via página Web
		//Como dito no README.md, não tive muito tempo para procurar formar do AJAX Fetch se comunicar com o JAVA
            	if(inp == "mostrarDB") {
     			   pstmt   = conn.prepareStatement(querySelect);
    			   rs	   = pstmt.executeQuery();
    			   System.out.println("Id_alunos\\t\\tnome\\t\\temail\\t\\tage\\n");
    			   while(rs.next()) {
    				   System.out.println(rs.getInt(1));
    				   System.out.println(rs.getString(2));
    				   System.out.println(rs.getString(3));
    				   System.out.println(rs.getInt(4));
    			   }
            	}
            	
            	if(inp == "incluirDB") {
     			   pstmt = conn.prepareStatement(queryInsert);
    			   pstmt.setString(1, nome);
    			   pstmt.setString(2, email);
    			   pstmt.setInt(3, age);
    			   int row = pstmt.executeUpdate();
    			   System.out.println(row);
            	}
            	
            	if(inp == "excluirDB") {
 				   pstmt   = conn.prepareStatement(queryExclude);
 				   pstmt.setInt(1, id);
 				   int x = pstmt.executeUpdate();
 				   System.out.println("Dado excluido" + x);
            	}
        }
        
	//Catch responsável pelo erro referente ao carregamento do drive Class.forName()    
        catch(ClassNotFoundException e) {
        	JOptionPane.showMessageDialog(null, e);
        }
        
	//Catch responsável por qualquer outro erro de SQL    
        catch(SQLException e) {
        	JOptionPane.showMessageDialog(null, e);
        	System.out.println("Erro No final");
        }
        
        return(conn);
          
    };

  }
