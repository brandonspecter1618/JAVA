<%@ page session="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>  
<!--Utilizado para habilitar o UTF-8 para reconhecer ç ou ~ ou acentuação-->

<%
    HttpSession session = request.getSession(false); // Não cria uma nova sessão se não existir
    if (session == null || session.getAttribute("sessionStart") == null || !(Boolean) session.getAttribute("sessionStart")) {
        response.sendRedirect("index.jsp"); // Redireciona para a página de login
        return;
    }
%>


<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="describes" content="HTML55">
        <meta name="autor" content="Brandon Specter">

        <link href="css/php_java_css.css" rel="stylesheet">
        
                        <!--Font for Headers-->
        <link href='https://fonts.googleapis.com/css?family=Oswald:300' rel='stylesheet' type='text/css'>

                        <!--Font for Paragraph-->

                           <!--JAVASCRIPT-->

        <script src="/js/phpJsMain.js"></script>
                                
                           <!--JAVASCRIPT-->



    </head>

<body>

    <nav>
        <ul class="menu-4">
                <li><a href="wiki.jsp" data-hover="Home">Home</a></li>
                <li><a href="calc.jsp" data-hover="Calc JS">Calc JS</a></li>
                <li><a href="phpMain.jsp" data-hover="PHP">PHP</a></li>
                <li><a href="php1.jsp" data-hover="JS">JS</a></li>
                <li><a href="php_java.jsp" data-hover="PHP/JavaScript">PHP/JavaScript</a></li>
                <li><a href="testservlet.jsp" data-hover="TestServletDB">TestServletDB</a></li>
                <li><a href="buttons.jsp" data-hover="Buttons">Buttons</a></li>
                <li><a href="lightbulb.jsp" data-hover="Light Bulb">Light Bulb</a></li>
                <li><a href="register.jsp" data-hover="Register">Register</a></li>
                <li><a href="logout.jsp" data-hover="Logout">Logout</a></li>
                <li><a href="index.jsp" data-hover="TOMCAT MANAGE">TOMCAT MANAGE</a></li>
            </ul>
    </nav>
    

    <div class="projectJs">
        <p>PHP/JAVASCRIPT</p> 
        <br>
        <label for="">Value1:</label>
        <input type="text" id="num1" placeholder="Nome">
        <label for="">Value2 </label>
        <input type="text" id="num2" placeholder="Senha">
        <br><br>      
        <p>    
        <button type="button" class="var_1button" onclick="phpjsMain()">ClickHere</button>
        <p class="p_result" id="result"></p>
    </div>









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