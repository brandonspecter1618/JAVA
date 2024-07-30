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

<html lang="pt-BR">
    <head>
        <meta charset="utf-8">
        <meta name="describes" content="HTML55">
        <meta name="autor" content="Brandon Specter">

        <link href="css/php2.css" rel="stylesheet">
        <link href="responsive/responsive.css" rel="stylesheet">

        <title>PHP1</title>
        
                        <!--Font for Headers-->
        <link href='https://fonts.googleapis.com/css?family=Oswald:300' rel='stylesheet' type='text/css'>                
        <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">


                        <!--Font for Paragraph-->

        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+JP&display=swap" rel="stylesheet">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    </head>

<body>

    <div class="var_block_menu"></div>


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

    <div class="var_div_input">
        <form action="servletTest" method="post">
            <p class="var_p" id="result">Banco de Dados MyCompany</p>
            
            <div class="var_div_form">
                <div class="var_div_label">    
                    <label for="value1" class="var_p_label">ID_DELETE:</label>
                    <label for="value1" class="var_p_label">Email:</label>
                    <label for="value2" class="var_p_label">Password:</label>
                </div>    

                <div class="var_div_input_input">
                    <input type="text" name="inp1" placeholder="ID:">
                    <input type="text" name="inp2" placeholder="Email:">
                    <input type="text" name="inp3" placeholder="Password:">
                </div>
                
                    <select class="var_input_select_gender" name="inp4">
                        <option value="">Escolha a opção</option>
                        <option value="0">Test Connection</option>
                        <option value="1">Mostrar Todos Dados Do Banco De Dados</option>
                        <option value="2">Incluir No Banco De Dados</option>
                        <option value="3">Excluir Do Banco De Dados</option>
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
