<%@ page session="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<%
    HttpSession session = request.getSession();
    session.setAttribute("sessionStart", false);
    response.sendRedirect("index.jsp");
%>