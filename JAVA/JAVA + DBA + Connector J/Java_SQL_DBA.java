//Error 

/*
mysql-connector-java-5.1.39 Funciona corretamente
apontado para Class.forName("com.mysql.jdbc.Driver")

Já os mais novos tem suporte a tanto ao com.mysql.jdbc.Drive
quanto ao mais novo Class.forName("com.mysql.cj.jdbc.Driver")
*/

/*

Loading class `com.mysql.jdbc.Driver'. 
This is deprecated. The new driver 
class is `com.mysql.cj.jdbc.Driver'. 
The driver is automatically registered via the 
SPI and manual loading of the driver class is 
generally unnecessary.

Conectado com sucesso!

*/

//Java Utilizando o Statement and PreparedStatement para Insert Update Delete Select algo do DB 

/* A diferença entre elas é que você pode usar Statement quando você pretende executar instruções SQL fixas, 
ou seja instruções de texto puro, como as seguinte:
*/

Statement stmt = conn.createStatement();  
ResultSet rs = stmt.executeQuery("SELECT col1, col2, col3 FROM sua_tabela WHERE col1 = 'value1' AND col3 = 1");


/* 
E quando você pretende executar instruções SQL parametrizadas como a seguinte abaixo, você deve usar PreparedStatement, 
que também possibilita que você especifique o tipo do parâmetro passado como Int, String, Float etc, 
também fornecendo uma maior segurança na integridade de dados passado para execução no banco de dados, 
pois evita que você passe dados invalidos na instrução sql:

*/

PreparedStatement stmt = conn.preparedStatement("SELECT col1, col2 FROM sua_tabela WHERE col1 = ? AND col3 = ?");
stmt.setString(1, "value1");
stmt.setInt(2, 1);
ResultSet rs = stmt.executeQuery();



//obs

/* 
executeQuery() como o próprio nome diz, é para consultas, quase sempre usa-se um SELECT nele e um resultado 
será retornado com os dados, ou um erro.

executeUpdate() como o próprio nome diz, é para atualizações, deve-se usar um comando de escrito como 
INSERT, UPDATE e DELETE, e ele retorna o que foi afetado e não um resultado de dados.

*/

//Code Example

package com.mkyong.jdbc.preparestatement.row;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;

public class RowInsert {

    private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/test", "postgres", "password");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {

            preparedStatement.setString(1, "mkyong");
            preparedStatement.setBigDecimal(2, new BigDecimal(799.88));
            preparedStatement.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row); //1

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


/******************************************************************************/

//Utilizando Select + Statement

// Java program to illustrate 
// selecting from Database
import java.sql.*;
  
public class select 
{
    public static void main(String args[])
    {
        String id = "id1";
        String pwd = "pwd1";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("
                    jdbc:oracle:thin:@localhost:1521:orcl", "login1", "pwd1");
            Statement stmt = con.createStatement();
              
            // SELECT query
            String q1 = "select * from userid WHERE id = '" + id + 
                                    "' AND pwd = '" + pwd + "'";
            ResultSet rs = stmt.executeQuery(q1);
            if (rs.next())
            {
                System.out.println("User-Id : " + rs.getString(1));
                System.out.println("Full Name :" + rs.getString(3));
                System.out.println("E-mail :" + rs.getString(4));
            }
            else
            {
                System.out.println("No such user id is already registered");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
Output :
User-Id : id1
Full Name : geeks for geeks
E-mail :geeks@geeks.org
Observação: aqui, o índice da coluna aqui é baseado em 1, a primeira coluna estará no índice 1, a segunda no índice 2 e assim por diante.
Para outros tipos de dados, o ResultSet fornece métodos getter apropriados:

getString()
getInt()
getFloat()
getDate()
getTimestamp()
… ..


/******************************************************************************/
/*Java Connection  Test */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class jsTestDB {

	public static void main(String[] args) {
		connDB();
	}
	
	public static Connection connDB(){
		
		String name  = "Brandon";
		String email = "brandon@gmail.com";
		int    age   = 29;
		
		String url = "jdbc:mysql://127.0.0.1:3306/db_alunos";
		String username = "root";
		String password = "22091992";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
			try {
				
				//Declaração do drive a ser utilizado 	
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Class.forName("org.postgresql.Driver");
				
				//Dados para conexão ao DB
				
				conn = DriverManager.getConnection(url, username, password);
				
				//Teste de conexão
			        if (conn != null) {
			            System.out.println("Conectado com sucesso!");
			            
			        }else {
			        	System.out.println("Não foi possivel realizar conexão");
			        }
			     
			}
			
			catch(ClassNotFoundException e) {
	        	JOptionPane.showMessageDialog(null, e);
	        	System.out.println(e);
	        	return null;
			}
			
			catch(SQLException e) {
				JOptionPane.showMessageDialog(null, e);
	            System.out.println(e);
	            return null;
			}
		
		return(conn);
	}

}

/************************************************ */

//Insert With PreparedStatement

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class jsTest {

	public static void main(String[] args) {
		connDB();
	}
	
	public static Connection connDB(){
		
		String name  = "Brandon";
		String email = "brandon@gmail.com";
		int    age   = 29;
		String url = "jdbc:mysql://127.0.0.1:3306/db_alunos";
		String username = "root";
		String password = "22091992";
		String query = "insert into alunos(nome, email, age) values(?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
			try {
				
				//Declaração do drive a ser utilizado 	
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Class.forName("org.postgresql.Driver");
				
				//Dados para conexão ao DB
				
				conn = DriverManager.getConnection(url, username, password);
				
				//Teste de conexão
			        if (conn != null) {
			            System.out.println("Conectado com sucesso!");
			            
			        }else {
			        	System.out.println("Não foi possivel realizar conexão");
			        }
			     
			   //Atualizacao via insert banco de dados
			   pstmt = conn.prepareStatement(query);
			   pstmt.setString(1, name);
			   pstmt.setString(2, email);
			   pstmt.setInt(3, age);
			   int row = pstmt.executeUpdate();
			   System.out.println(row);
			}
			
			catch(ClassNotFoundException e) {
	        	JOptionPane.showMessageDialog(null, e);
	        	System.out.println(e);
	        	return null;
			}
			
			catch(SQLException e) {
				JOptionPane.showMessageDialog(null, e);
	            System.out.println(e);
	            return null;
			}
		
		return(conn);
	}

}


//or

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class jsTest {

	public static void main(String[] args) {
		connDB();
	}
	
	public static Connection connDB(){
		
		String name  = "Brandon";
		String email = "brandon@gmail.com";
		int    age   = 29;
		String query = "insert into alunos(nome, email, age) values(?, ?, ?)";
		Connection conn = null;
		
			try {
				
				//Declaração do drive a ser utilizado 
				
				
				Class.forName("com.mysql.jdbc.Driver");
				//Class.forName("org.postgresql.Driver");
				
				//Dados para conexão ao DB
				
				String url = "jdbc:mysql://127.0.0.1:3306/db_alunos";
				String username = "root";
				String password = "22091992";
				conn = DriverManager.getConnection(url, username, password);
				
				//Teste de conexão
			        if (conn != null) {
			            System.out.println("Conectado com sucesso!");
			            
			        }else {
			        	System.out.println("Não foi possivel realizar conexão");
			        }
			     
			   //Atualizacao via insert banco de dados
			   PreparedStatement pstmt = conn.prepareStatement(query);
			   pstmt.setString(1, name);
			   pstmt.setString(2, email);
			   pstmt.setInt(3, age);
			   int row = pstmt.executeUpdate();
			   System.out.println(row);
			   pstmt.close();
			   conn.close();
			}
			
			catch(ClassNotFoundException e) {
	        	JOptionPane.showMessageDialog(null, e);
	        	System.out.println(e);
	        	return null;
			}
			
			catch(SQLException e) {
				JOptionPane.showMessageDialog(null, e);
	            System.out.println(e);
	            return null;
			}
		
		return(conn);
	}

}

/*********************************************************/

//Select With PreparedStatement

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class jsTestDB {

	public static void main(String[] args) {
		connDB();
	}
	
	public static Connection connDB(){
		
		String name  = "Brandon";
		String email = "brandon@gmail.com";
		int    age   = 29;
		String url = "jdbc:mysql://127.0.0.1:3306/db_alunos";
		String username = "root";
		String password = "22091992";
		String query = "select id_aluno, nome, email, age from alunos";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
			try {
				
				//Declaração do drive a ser utilizado 	
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Class.forName("org.postgresql.Driver");
				
				//Dados para conexão ao DB
				
				conn = DriverManager.getConnection(url, username, password);
				
				//Teste de conexão
			        if (conn != null) {
			            System.out.println("Conectado com sucesso!");
			            
			        }else {
			        	System.out.println("Não foi possivel realizar conexão");
			        }
			     
			   //Atualizacao via insert banco de dados
			   pstmt   = conn.prepareStatement(query);
			   rs	   = pstmt.executeQuery();
			   System.out.println("Tabela DB" +'\n');
			   while(rs.next()) {
				   System.out.println("Id: " + rs.getInt(1));
				   System.out.println("Nome: " + rs.getString(2));
				   System.out.println("Email:" + rs.getString(3));
				   System.out.println("Age" + rs.getInt(4) + "\n");
			   }
			}
			
			catch(ClassNotFoundException e) {
	        	JOptionPane.showMessageDialog(null, e);
	        	System.out.println(e);
	        	return null;
			}
			
			catch(SQLException e) {
				JOptionPane.showMessageDialog(null, e);
	            System.out.println(e);
	            return null;
			}
		
		return(conn);
	}

}
}


///////////////////or

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class jsTest {

	public static void main(String[] args) {
		ConnDB objConn = new ConnDB();
		objConn.connDB();
	}
}

class ConnDB{
	public static Connection connDB(){
		
		String name  = "Brandon";
		String email = "brandon@gmail.com";
		int    age   = 29;
		String url = "jdbc:mysql://127.0.0.1:3306/db_alunos";
		String username = "root";
		String password = "22091992";
		String query = "select id_alunos, nome, email, age from alunos";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
			try {
				
				//Declaração do drive a ser utilizado 	
				Class.forName("com.mysql.jdbc.Driver");
				//Class.forName("org.postgresql.Driver");
				
				//Dados para conexão ao DB
				
				conn = DriverManager.getConnection(url, username, password);
				
				//Teste de conexão
			        if (conn != null) {
			            System.out.println("Conectado com sucesso!");
			            
			        }else {
			        	System.out.println("Não foi possivel realizar conexão");
			        }
			     
			   //Atualizacao via insert banco de dados
			   pstmt   = conn.prepareStatement(query);
			   rs	   = pstmt.executeQuery();
			   System.out.println("Id_alunos\\t\\tnome\\t\\temail\\t\\tage\\n");
			   while(rs.next()) {
				   System.out.println(rs.getInt(1));
				   System.out.println(rs.getString(2));
				   System.out.println(rs.getString(3));
				   System.out.println(rs.getInt(4));
			   }
			}
			
			catch(ClassNotFoundException e) {
	        	JOptionPane.showMessageDialog(null, e);
	        	System.out.println(e);
	        	return null;
			}
			
			catch(SQLException e) {
				JOptionPane.showMessageDialog(null, e);
	            System.out.println(e);
	            return null;
			}
		
		return(conn);
	}

}
/*********************************************************/

//Delete With PreparedStatement


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class jsTest {

	public static void main(String[] args) {
		connDB();
	}
	
	public static Connection connDB(){
		
		Scanner scan = new Scanner(System.in);
		String name  = "Brandon";
		String email = "brandon@gmail.com";
		int    age   = 29;
		int    id    = scan.nextInt();
		String url = "jdbc:mysql://127.0.0.1:3306/db_alunos";
		String username = "root";
		String password = "22091992";
		String query = "delete from alunos WHERE id_alunos = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
			try {
				
				//Declaração do drive a ser utilizado 	
				Class.forName("com.mysql.jdbc.Driver");
				//Class.forName("org.postgresql.Driver");
				
				//Dados para conexão ao DB
				
				conn = DriverManager.getConnection(url, username, password);
				
				//Teste de conexão
			        if (conn != null) {
			            System.out.println("Conectado com sucesso!");
			            
			        }else {
			        	System.out.println("Não foi possivel realizar conexão");
			        }
			     
			   //Atualizacao via insert banco de dados
			   pstmt   = conn.prepareStatement(query);
			   pstmt.setInt(1, id);
			   int x = pstmt.executeUpdate();
			   System.out.println("Dado excluido" + x);
	
			}
			
			catch(ClassNotFoundException e) {
	        	JOptionPane.showMessageDialog(null, e);
	        	System.out.println(e);
	        	return null;
			}
			
			catch(SQLException e) {
				JOptionPane.showMessageDialog(null, e);
	            System.out.println(e);
	            return null;
			}
		
		return(conn);
	}

}


//or

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class jsTest {

	public static void main(String[] args) {
		ConnDB objConn = new ConnDB();
		objConn.connDB();
	}
}


class ConnDB{
	public static Connection connDB(){
			
			String name  = "Brandon";
			String email = "brandon@gmail.com";
			int    age   = 29;
			int    id    = 11;
			String url = "jdbc:mysql://127.0.0.1:3306/db_alunos";
			String username = "root";
			String password = "22091992";
			String query = "delete from alunos WHERE id_alunos = ?";
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
				try {
					
					//Declaração do drive a ser utilizado 	
					Class.forName("com.mysql.jdbc.Driver");
					//Class.forName("org.postgresql.Driver");
					
					//Dados para conexão ao DB
					
					conn = DriverManager.getConnection(url, username, password);
					
					//Teste de conexão
				        if (conn != null) {
				            System.out.println("Conectado com sucesso!");
				            
				        }else {
				        	System.out.println("Não foi possivel realizar conexão");
				        }
				     
				   //Atualizacao via insert banco de dados
				   pstmt   = conn.prepareStatement(query);
				   pstmt.setInt(1, id);
				   int x = pstmt.executeUpdate();
				   System.out.println("Dado excluido" + x);
		
				}
				
				catch(ClassNotFoundException e) {
		        	JOptionPane.showMessageDialog(null, e);
		        	System.out.println(e);
		        	return null;
				}
				
				catch(SQLException e) {
					JOptionPane.showMessageDialog(null, e);
		            System.out.println(e);
		            return null;
				}
			
			return(conn);
		}
}

/*********************************************************/

##########################################################
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class jsTestDB {
	
	public static void main(String args[]){
		getConexaoMySQL();
	};


	//Método de Conexão//

	public static Connection getConexaoMySQL() {

	        Connection conn = null;          //atributo do tipo Connection

		try {
	
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
		
			        String serverName = "127.0.0.1";    //caminho do servidor do BD
			        String mydatabase = "db_alunos";        //nome do seu banco de dados
			        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
			        String username = "root";        //nome de um usuário de seu BD
			        String password = "22091992";      //sua senha de acesso
		
			        conn = DriverManager.getConnection(url, username, password);
		
			        if (conn != null) {
			            System.out.println("STATUS--->Conectado com sucesso!");
			            
			        }else {
			        	System.out.println("STATUS--->Não foi possivel realizar conexão");
			        }
		
			        	return conn;
		
			} 
		
			catch (ClassNotFoundException e) {  //Driver não encontrado

	            	System.out.println("O driver expecificado nao foi encontrado.");
	            	return null;

	        } 
		
		
			catch (SQLException e) {

	            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
	            return null;
	        }

		}
	}

########################################################################################

TEST SELECT DB
							 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class jsTestDB {

	public static void main(String[] args) {
		connDB();
	}
	
	public static Connection connDB(){
		
		String name  = "Brandon";
		String email = "brandon@gmail.com";
		int    age   = 29;
		String url = "jdbc:mysql://127.0.0.1:3306/db_alunos";
		String username = "root";
		String password = "22091992";
		String query = "select id_aluno, nome, email, age from alunos";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
			try {
				
				//Declaração do drive a ser utilizado 	
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Class.forName("org.postgresql.Driver");
				
				//Dados para conexão ao DB
				
				conn = DriverManager.getConnection(url, username, password);
				
				//Teste de conexão
			        if (conn != null) {
			            System.out.println("Conectado com sucesso!");
			            
			        }else {
			        	System.out.println("Não foi possivel realizar conexão");
			        }
			     
			   //Atualizacao via insert banco de dados
			   pstmt   = conn.prepareStatement(query);
			   rs	   = pstmt.executeQuery();
			   System.out.println("Tabela DB" +'\n');
			   while(rs.next()) {
				   System.out.println("Id: " + rs.getInt(1));
				   System.out.println("Nome: " + rs.getString(2));
				   System.out.println("Email:" + rs.getString(3));
				   System.out.println("Age" + rs.getInt(4) + "\n");
			   }
			}
			
			catch(ClassNotFoundException e) {
	        	JOptionPane.showMessageDialog(null, e);
	        	System.out.println(e);
	        	return null;
			}
			
			catch(SQLException e) {
				JOptionPane.showMessageDialog(null, e);
	            System.out.println(e);
	            return null;
			}
		
		return(conn);
	}

}



/***********************************************************************/

//Test Connection DB + throws + Class

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mycompany.dbConn;

/**
 *
 * @author hepta.brendo.p
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class dbConn {
    public static void main(String[] args) 
            throws SQLException, ClassNotFoundException {
		ClassConnDB objConn = new ClassConnDB();
                objConn.connDB();
    }
}

class ClassConnDB{

    public static Connection connDB() 
                throws SQLException, ClassNotFoundException{
		
            String name  = "Brandon";
            String email = "brandon@gmail.com";
            int    age   = 29;
            String url = "jdbc:mysql://127.0.0.1:3306/db_alunos";
            String username = "root";
            String password = "22091992";
            String query = "select id_aluno, nome, email, age from alunos";
            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
		


                //Declaração do drive a ser utilizado 	
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                //Class.forName("org.postgresql.Driver");
                //Dados para conexão ao DB
                conn = DriverManager.getConnection(url, username, password);
                
                    if(conn != null){
                        JOptionPane.showMessageDialog(null, "Connection Sucessfully");
                        System.out.println("Connection Sucessfully");
                    }else{
                        System.out.println("Connection Refused");
                    }
                return(conn);
        }
}

