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
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
    
    <h1>Enviar Número</h1>
    <form action="servletTestLogin" method="post">
        <!--
        
        Aqui o nome "servletTest" da pagina associado ao servlet
        que esta sendo identificado la no codigo servlet como
        @WebServlet("/servletTest")
        
        Este nome "servletTest" e necessario para que a pagina seja
        redirecionada ao Servlet corretamente.
        
        -->
        <label for="numero">Value 1:</label>
        <input name="inp1">
        <br><br>
        
        <label for="numero">Value 2:</label>
        <input name="inp2">
        <input type="submit" value="Enviar">
    </form>
    </body>
</html>