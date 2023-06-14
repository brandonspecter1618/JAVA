/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.mycompany.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.ServletException;



import br.com.mycompany.dbConn.dbConn;



/**
 *
 * @author hepta.brendo.p
 */
@WebServlet(name = "myServlet", urlPatterns = {"/myServlet"})
public class myServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            int select = Integer.valueOf(request.getParameter("inp4"));
            
            String querySelect = "select * from alunos";
            String queryInsert = "insert into alunos(nome, email, age) values(?, ?, ?)";
            String queryDelete = "delete from alunos WHERE id_aluno = ?";
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
    
        
                try {
                    
                    //Selecionar todos os dados do banco de dados
                    
                    if(select == 0){
                        Connection conn = dbConn.connDB();
                        pstmt = conn.prepareStatement(querySelect);
                        rs    = pstmt.executeQuery();
                        
                           
                            out.println("<html><body><h2>The Select query has following results : </h2>");
                            out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
                            out.println("<tr>");
                            out.println("<td><b>Id</b></td>");
                            out.println("<td><b>Nome</b></td>");
                            out.println("<td><b>Email</b></td>");
                            out.println("<td><b>Age</b></td>");
                            out.println("</tr>");
                            
                                while(rs.next()){
                                    out.println("<tr>");
                                    out.println("<td>"+rs.getString(1) + "</td>");
                                    out.println("<td>"+rs.getString(2) + "</td>");
                                    out.println("<td>"+rs.getString(3) + "</td>");
                                    out.println("<td>"+rs.getString(4) + "</td>");
                                    out.println("</tr>");
                                }
                    }
                    
                    //Inserir dados no banco de dados
                    
                    if(select == 1){
                        String nome  = request.getParameter("inp1");
                        String email = request.getParameter("inp2");
                        int    age   = Integer.valueOf(request.getParameter("inp3"));
                        
                        Connection conn = dbConn.connDB();
                        pstmt = conn.prepareStatement(queryInsert);
                        pstmt.setString(1, nome);
                        pstmt.setString(2, email);
                        pstmt.setInt(3, age);
                        pstmt.executeUpdate();
                        pstmt.close();
                          
                        out = response.getWriter();
                        out.println("<html><body style='background-color: #333333'><h1 style='color:#fff'>Result Below</h1></body></html>");
                        out.println("<p style='font-size:20px; color: #fff'>" + "Insert Row Sucessfully");
                        out.println("</p>");
                    }
                    
                    
                    //Deletar dados do banco de dados
                    
                    if(select == 2){
                        int   delete = Integer.valueOf(request.getParameter("inp5"));
                        Connection conn = dbConn.connDB();
                        pstmt = conn.prepareStatement(queryDelete);
                        pstmt.setInt(1, delete);
                        int row = pstmt.executeUpdate();
                        
                            if(row != 0){
                                out.println("<html><body style='background-color: #333333'><h1 style='color:#fff'>Result Below</h1></body></html>");
                                out.println("<p style='font-size:20px; color: #fff'>" + "Delete Row Sucessfully");
                                out.println("</p>");    
                            }else{
                                out.println("<html><body style='background-color: #333333'><h1 style='color:#fff'>Result Below</h1></body></html>");
                                out.println("<p style='font-size:20px; color: #fff'>" + " Error Delete Row");
                                out.println("</p>");      
                        }
                    }
                    
                    /*    
                    out.println("<html><body style='background-color: #333333'><h1 style='color:#fff'>Result Below</h1></body></html>");
                    out.println("<p style='font-size:20px; color: #fff'>" + "test");
                    out.println("</p>");
                 
                    Connection conn = dbConn.connDB();
                    pstmt = conn.prepareStatement(query);
                    pstmt.setInt(1, delete);
                    int row = pstmt.executeUpdate();

                    */
                                   
               
                }
                
                catch(Exception e){
                    e.printStackTrace();
                }
    }
}
