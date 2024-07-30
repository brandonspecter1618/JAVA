#################################################
#                                               #
#             iNSERT DBA JAVA                   #
#                                               #
#################################################


package br.specter.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class DBConn {
    public static void main(String args[]) 
            throws SQLException, ClassNotFoundException{
        connDB();
    }
    
    public static Connection connDB() 
            throws SQLException, ClassNotFoundException{

        int age;
        String name, email, url, username, password, querySelect, queryInsert, queryExclude;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        username   = "root";
        password   = "22091992";
        name       = "Lorena";
        email      = "lorena@ifb.gov.br";
        age        = 30;
        url        = "jdbc:mysql://127.0.0.1/db_alunos";
        querySelect  = "select id_alunos, nome, email, age from alunos";
	    queryInsert  = "insert into alunos(nome, email, age) values(?, ?, ?)";
	    queryExclude = "delete from alunos WHERE id_alunos = ?";

            try{

                Class.forName("com.mysql.jdbc.Driver");
            	conn = DriverManager.getConnection(url, username, password);
                
                    if(conn != null){
                        JOptionPane.showMessageDialog(null, "Você está conectado");
                        System.out.println("Você está conectado");
                    }
                    
                    pstmt = conn.prepareStatement(queryInsert);
                    pstmt.setString(1, name);
                    pstmt.setString(2, email);
                    pstmt.setInt(3, age);
                    int row = pstmt.executeUpdate();
                    System.out.println("Insert Data Row " + row);
                    conn.close();
                    
            }
            catch(ClassNotFoundException e){
                JOptionPane.showMessageDialog(null, "Problem with " + e);
                System.out.println(e);
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error is " + e);
                System.out.println(e);
            }
        
        return(conn);       
    }
}


#################################################
#                                               #
#             DELETE DBA JAVA                   #
#                                               #
#################################################

package br.specter.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class DBConn {
    public static void main(String args[]) 
            throws SQLException, ClassNotFoundException{
        connDB();
    }
    
    public static Connection connDB() 
            throws SQLException, ClassNotFoundException{

        int age, id;
        String name, email, url, username, password, querySelect, queryInsert, queryExclude;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        id         = 1;
        username   = "root";
        password   = "22091992";
        name       = "Lorena";
        email      = "lorena@ifb.gov.br";
        age        = 30;
        url        = "jdbc:mysql://127.0.0.1/db_alunos";
        querySelect  = "select id_alunos, nome, email, age from alunos";
	queryInsert  = "insert into alunos(nome, email, age) values(?, ?, ?)";
	queryExclude = "delete from alunos WHERE id_aluno = ?";

            try{

                Class.forName("com.mysql.jdbc.Driver");
            	conn = DriverManager.getConnection(url, username, password);
                
                    if(conn != null){
                        JOptionPane.showMessageDialog(null, "Você está conectado");
                        System.out.println("Você está conectado");
                    }
                    
                    pstmt = conn.prepareStatement(queryExclude);
                    pstmt.setInt(1, id);
                    int row = pstmt.executeUpdate();
                    System.out.println("Delete Data ID " + row);
                    conn.close();
                    
            }
            catch(ClassNotFoundException e){
                JOptionPane.showMessageDialog(null, "Problem with " + e);
                System.out.println(e);
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error is " + e);
                System.out.println(e);
            }
        
        return(conn);       
    }
}

#################################################
#                                               #
#             SELECT DBA JAVA                   #
#                                               #
#################################################

package br.specter.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class DBConn {
    public static void main(String args[]) 
            throws SQLException, ClassNotFoundException{
        connDB();
    }
    
    public static Connection connDB() 
            throws SQLException, ClassNotFoundException{

        int age, id;
        String name, email, url, username, password, querySelect, queryInsert, queryExclude;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        id         = 1;
        username   = "root";
        password   = "22091992";
        name       = "Lorena";
        email      = "lorena@ifb.gov.br";
        age        = 30;
        url        = "jdbc:mysql://127.0.0.1/db_alunos";
        querySelect  = "select id_aluno, nome, email, age from alunos";
	queryInsert  = "insert into alunos(nome, email, age) values(?, ?, ?)";
	queryExclude = "delete from alunos WHERE id_aluno = ?";

            try{

                Class.forName("com.mysql.jdbc.Driver");
            	conn = DriverManager.getConnection(url, username, password);
                
                    if(conn != null){
                        JOptionPane.showMessageDialog(null, "Você está conectado");
                        System.out.println("Você está conectado");
                    }
                    
                    pstmt = conn.prepareStatement(querySelect);
                    rs    = pstmt.executeQuery();
                        while(rs.next()){
                            System.out.println();
                            System.out.println("Id_aluno: " + rs.getInt(1));
                            System.out.println("Nome: " + rs.getString(2));
                            System.out.println("Email:" + rs.getString(3));
                            System.out.println("Age: " + rs.getInt(4));
                        }
                    conn.close();
                    
            }
            catch(ClassNotFoundException e){
                JOptionPane.showMessageDialog(null, "Problem with " + e);
                System.out.println(e);
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error is " + e);
                System.out.println(e);
            }
        
        return(conn);       
    }
}
