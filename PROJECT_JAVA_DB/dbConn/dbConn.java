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
		connDB();
    }
	
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




        


