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

        <link href="css/calc.css" rel="stylesheet">

   
        <link rel="preconnect" href="https://fonts.gstatic.com">
        
                        <!--Font for Headers-->
                          
        <link href='https://fonts.googleapis.com/css?family=Oswald:300' rel='stylesheet' type='text/css'>

        <!--Font for Paragraph-->
        <!--Font for Paragraph-->

                    <!--JAVASCRIPT-->

        <script src="/js/calc.js"></script>
                    
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
    



<!----------------CALCULATE------------------------->

<div class="position_calc">
    <form name="calcform" method="post" action="">
    
        <input type="text" name="visor" id="visor" />
    
        <table>
            <tr>
                <td><input type="button" name="num7" class="num" value="7" onclick="calcNum(7)" /></td>
                <td><input type="button" name="num8" class="num" value="8" onclick="calcNum(8)" /></td>
                <td><input type="button" name="num9" class="num" value="9" onclick="calcNum(9)" /></td>
                <td><input type="button" name="somar" class="oper" value="+" onclick="calcParse('somar')" /></td>
            </tr>
            <tr>
                <td><input type="button" name="num4" class="num" value="4" onclick="calcNum(4)" /></td>
                <td><input type="button" name="num5" class="num" value="5" onclick="calcNum(5)" /></td>
                <td><input type="button" name="num6" class="num" value="6" onclick="calcNum(6)" /></td>
                <td><input type="button" name="subtrair" class="oper" value="-" onclick="calcParse('subtrair')" /></td>
            </tr>
            <tr>
                <td><input type="button" name="num1" class="num" value="1" onclick="calcNum(1)" /></td>
                <td><input type="button" name="num2" class="num" value="2" onclick="calcNum(2)" /></td>
                <td><input type="button" name="num3" class="num" value="3" onclick="calcNum(3)" /></td>
                <td><input type="button" name="multiplicar" class="oper" value="*" onclick="calcParse('multiplicar')" /></td>
            </tr>
            <tr>
                <td><input type="button" name="num0" class="num" value="0" onclick="calcNum(0)" /></td>
                <td><input type="button" name="igual" class="num" value="=" onclick="calcParse('resultado')" /></td>
                <td><input type="button" name="limpar" class="num" value="C" onclick="calcLimpar()" /></td>
                <td><input type="button" name="dividir" class="oper" value="/" onclick="calcParse('dividir')" /></td>
            </tr>
        </table>
    </form>
</div>

<!----------------CALCULATE------------------------->



















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