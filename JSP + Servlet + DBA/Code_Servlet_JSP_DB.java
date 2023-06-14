/*****************************************************************************/
    
//                             Page JSP index.jsp
    
/*****************************************************************************/

<%-- 
    Document   : index
    Created on : 15/09/2022, 11:26:35
    Author     : Brandon
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="pt-BR">
    <head>
        <meta charset="utf-8">
        <meta name="describes" content="HTML55">
        <meta name="autor" content="Brandon Specter">

        <link href="/css/subcss/php2_css.css" rel="stylesheet">
        <link href="responsive/responsive.css" rel="stylesheet">

        <title>PHP1</title>
        
                        <!--Font for Headers-->
        <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">


                        <!--Font for Paragraph-->

        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+JP&display=swap" rel="stylesheet">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    </head>

<body>

    <div class="var_block_menu"></div>


    <div class="position_menu">
        <nav role="navigation" class="primary-navigation">
            <ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="#">Produtos</a>
                    <ul>
                        <li><a href="#">Web Development</a></li>
                        <li><a href="#">Web Design</a></li>
                        <li><a href="#">Illustration</a></li>
                        <li><a href="#">Iconography</a></li>
                    </ul>
                </li>
                <li><a href="php_java.html">PHP/JAVA</a>
                    <ul>
                        <li><a href="php1.html">PHP1</a></li>
                        <li><a href="#">PHP2</a></li>
                        <li><a href="#">PHP3</a></li>
                        <li><a href="#">PHP4</a></li>
                    </ul>
                </li>
                <li><a href="#">Contatos</a></li>
            </ul>
        </nav>
    </div>

    <div class="var_div_input">
        <form method="post" action="myServlet" target="_blank">
            <p class="var_p" id="result">Banco de Dados MyCompany</p>
            
            <div class="var_div_form">
                <div class="var_div_label">    
                    <label for="value1" class="var_p_label">ID</label>
                    <label for="value1" class="var_p_label">Name</label>
                    <label for="value2" class="var_p_label">Email</label>
                    <label for="value3" class="var_p_label">Age</label>
                </div>    

                <div class="var_div_input_input">    

                    <input type="text" name="inp5" placeholder="ID">
                    <input type="text" name="inp1" placeholder="NOME">
                    <input type="text" name="inp2" placeholder="EMAIL">
                    <input type="text" name="inp3" placeholder="AGE">

                </div>
                
                    <select class="var_input_select_gender" name="inp4">
                        <option value="">Escolha a opção</option>
                        <option value="0">Mostrar Todos Dados Do Banco De Dados</option>
                        <option value="1">Incluir No Banco De Dados</option>
                        <option value="2">Excluir Do Banco De Dados</option>
                    </select>
                
                <button class="var_1button" id="button2" onclick="">Clique Aqui</button>
            </div>  
        </form>
    </div>
  
    
        

    


    </script>
    
    
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>



</body>
</html>

/*****************************************************************************/
    
//                             Page JSP CSS index.jsp
    
/*****************************************************************************/

                /*CSS PHP Index*/


body {

    background-image: url(/photo/2.jpg);
    background-repeat: no-repeat;
    background-size: 100% 100%;
    background-color: #333;
    font-size: 16px;
    margin: 0;
    padding: 0;  
}


                /*Menu Site*/

.var_block_menu {
    position: relative;
    left: 0px;
    bottom: 18px;
    background-color:#4C4E7F;
    border-width: 5px;
    border-style: solid;
    border-color: #4C4E7F;
    margin: auto;
	width: 1423px;
	height: 100px; 
    box-sizing: border-box;
}

.position_menu {

    position: relative;
    left: 208px;
	bottom: 215px;
	width: 980px;
    height: 0px;
	box-sizing: border-box;
	  
}


nav.primary-navigation {
	margin: 0 auto;
	display: block;
	padding: 120px 0 0 0;
	text-align: center;
	font-size: 16px;
}
nav.primary-navigation ul li {
	list-style: none;
	margin: 0 auto;
	border-left: 3px solid #3ca0e7;   /*Cor das barras do menu*/
	display: inline-block;
	padding: 0 55px;           /*0 aumenta as barras do menu e o 30px aumenta o espaçamento entre as palvras do menu*/
	position: relative;
	text-decoration: none;
	text-align: center;
	font-family: 'Big Shoulders Stencil Display', cursive;   /*Fonte Do Google*/
}
nav.primary-navigation li a {
	color: #fff;           /*Cor das palavras*/
}
nav.primary-navigation li a:hover {
	color: #3ca0e7;        /*Cor de Hover*/
}
nav.primary-navigation li:hover {
	cursor: pointer;
}
nav.primary-navigation ul li ul {
	visibility: hidden;
	opacity: 0;
	position: absolute;
	padding-left: 0;       /*Aumenta o quadro depois que passa o mouse no menu*/
	left: 0;
	display: none;
	background: #4C4E7F;    /*Cor de fundo depois que passa o mouse em cima*/
	z-index:99;     /*Este comando faz com que um item sobreponha o outro. No caso o submenu sobrepondo o resto do site*/
}
nav.primary-navigation ul li:hover > ul, nav.primary-navigation ul li ul:hover {
	visibility: visible;
	opacity: 1;								
	display: block;
	min-width: 250px;                    /*Tamanho do quadrado quando passa o mouse em cima da pra aumentar colocando inclusive o min-height*/
	text-align: left;
	padding-top: 15px;                      /*O quão longe fica o text dentro do submenu com relação ao menu principal*/
	box-shadow: 0px 3px 20px -1px #4C4E7F;         /*5px esfuma  -1px controla a borda da cor maior ou menor */
}
nav.primary-navigation ul li ul li {
	clear: both;
	width: 100%;
	text-align: left;                     /*Através do 	position: relative você consegue movimentar o texto dentro do quadrado quando passa o mouse em cima*/
	margin-bottom: 20px;
	border-style: none;
}
nav.primary-navigation ul li ul li a:hover {
	padding-left: 10px;
	border-left: 2px solid #3ca0e7;       /*É a cor da borda left dentro do submenu*/
	transition: all 0.3s ease;
}
a {
	text-decoration: none;
}
a:hover {
	color: #3ca0e7;
}
ul li ul li a {
	transition: all 0.5s ease;
}

/*Button JS CSS*/

.var_1button {          /*With the Letter "A" */
    position: relative;
    bottom: 360px;
    left: 187px;
    border-top: 1px solid #96d1f8;
    background: #7265d4;
    background: -webkit-gradient(linear, left top, left bottom, from(#333785), to(#7265d4));
    background: -webkit-linear-gradient(top, #333785, #7265d4);
    background: -moz-linear-gradient(top, #333785, #7265d4);
    background: -ms-linear-gradient(top, #333785, #7265d4);
    background: -o-linear-gradient(top, #333785, #7265d4);
    padding: 14.5px 29px;
    -webkit-border-radius: 40px;
    -moz-border-radius: 40px;
    border-radius: 40px;
    -webkit-box-shadow: rgba(0,0,0,1) 0 1px 0;
    -moz-box-shadow: rgba(0,0,0,1) 0 1px 0;
    box-shadow: rgba(0,0,0,1) 0 1px 0;
    text-shadow: rgba(0,0,0,.4) 0 1px 0;
    color: white;
    font-size: 16px;
    font-family: Georgia, serif;
    text-decoration: none;
    vertical-align: middle;
    }
 .var_1button:hover {
    border-top-color: #28597a;
    background: #28597a;
    color: #ccc;
    }
 .var_1button:active {
    border-top-color: #1b435e;
    background: #1b435e;
    }


/*CSS Javascript*/

.var_p {
    margin-top: 30px;
    text-align: center;
    border-top-left-radius: 20px;
    border-top-right-radius: 20px;
    border-bottom-left-radius: 20px;
    border-bottom-right-radius: 20px;
    font-family: 'Noto Sans JP', sans-serif;
    font-size: 30px;
    color: #fff;

}

.var_p_label{
    margin-top: 40px;
    border-top-left-radius: 20px;
    border-top-right-radius: 20px;
    border-bottom-left-radius: 20px;
    border-bottom-right-radius: 20px;
    font-family: 'Noto Sans JP', sans-serif;
    font-size: 18px;
    color: #fff;
    box-sizing: border-box;
}

input[type=text] {
    position: relative;
    bottom: 250px;
    left: 70px;
    margin-top: 16px;
    font-family: 'Noto Sans JP', sans-serif;
    font-size: 16px;
    color: #fff;
    width: 220px;
    padding: 12px 20px;
    display: inline-block;
    border: 1px solid #000;
    border-radius: 100px;
    box-sizing: border-box;
    background-color: #000;
  }

input::placeholder {
    font-family: "Proxima Nova", -apple-system, "Helvetica Neue", Helvetica, Roboto, Arial, sans-serif;
    font-size: 15.5px;
    color: #ccc;
}

input:hover {
	-webkit-transform: scale(1.05);
	-moz-transform: scale(1.05);
	transform: scale(1.02);

}

.var_input_select_gender{
    position: relative;
    bottom: 450px;
    left: 410px;
    margin-top: 20px;
    font-family: 'Noto Sans JP', sans-serif;
    font-size: 13px;
    color: #fff;
    width: 220px;
    padding: 15px 20px;
    display: inline-block;
    box-sizing: border-box;
    background-color: #000;
    border-top-left-radius: 20px;
    border-top-right-radius: 20px;
    border-bottom-left-radius: 20px;
    border-bottom-right-radius: 20px;
}

 .projectCss{
     margin-top: -50px;
    
}

.var_div_input{
    padding: 100px;
    margin: auto;
    width: 1000px;
    height: 650px;
    border: 5px solid #4C4E7F;
    border-top-left-radius: 20px;
    border-top-right-radius: 20px;
    border-bottom-left-radius: 20px;
    border-bottom-right-radius: 20px;
    box-sizing: border-box;
}

.var_div_form{
    margin-left: 50px;
}

.var_div_label{
    margin-top: 10px;
    display: flex;
    flex-direction: column;
    box-sizing: border-box;
}

.var_div_input_input{
    display: flex;
    flex-direction: column;
    box-sizing: border-box;  
}



 /***************************************************************/

 .links{
    font-family: 'Noto Sans JP', sans-serif;
    font-size: 30px;
    color: #fff;
}

/*****************************************************************/

.phpcss {

    position: relative;
    top: 200px;
    font-family: 'Noto Sans JP', sans-serif;
    font-size: 30px;
    color: #fff;
}


/*****************************************************************************/
    
//                             Page ServLet
    
/*****************************************************************************/

//Página completa com os IF's

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


////////////////////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////SQL INSERT PAGE SERVLET///////////////////////////////////////////

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
            
            String nome  = request.getParameter("inp1");
            String email = request.getParameter("inp2");
            int    age   = Integer.valueOf(request.getParameter("inp3"));
            String query = "insert into alunos(nome, email, age) values(?, ?, ?)";
            PreparedStatement pstmt = null;
            PrintWriter out = null;
    
        
                try {

                        Connection conn = dbConn.connDB();
                        pstmt = conn.prepareStatement(query);
                        pstmt.setString(1, nome);
                        pstmt.setString(2, email);
                        pstmt.setInt(3, age);
                        pstmt.executeUpdate();
                        pstmt.close();
                          
                        out = response.getWriter();
                        out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>");  

                }
                
                catch(Exception e){
                    e.printStackTrace();
                }

    }
}


//////////////////////////////////////////////////////////////////////////////////


///////////////////////////SQL SELECT PAGE SERVLET////////////////////////////////

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
            

            String query = "select * from alunos";
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            PrintWriter out = response.getWriter();
    
        
                try {
                    Connection conn = dbConn.connDB();
                    pstmt = conn.prepareStatement(query);
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
                
                catch(Exception e){
                    e.printStackTrace();
                }

    }
}


//////////////////////////////////////////////////////////////////////////////////

//////////////////////////////DELETE SERVLET//////////////////////////////////////

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
        
            int returnValue = 0;
            int   delete = Integer.valueOf(request.getParameter("inp1"));
            String query = "delete from alunos WHERE id_aluno = ?";
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
    
        
                try {
                    Connection conn = dbConn.connDB();
                    pstmt = conn.prepareStatement(query);
                    pstmt.setInt(1, delete);
                    int row = pstmt.executeUpdate();
                        if(row != 0){
                            out.println("Delete " + delete + " Sucessfully");
                                JOptionPane.showMessageDialog(null, "Delete 100% Sucessfully");
                                    
                        }else{
                            out.println("Erro Delete " + delete);
                                JOptionPane.showMessageDialog(null, "Erro Delete File");
                                   
                        }
                }
                
                catch(Exception e){
                    e.printStackTrace();
                }
    }
}






/*****************************************************************************/
    
//                           DB CONNECTION 
    
/*****************************************************************************/


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




        


