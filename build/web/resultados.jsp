<%-- 
    Document   : resultados
    Created on : Feb 15, 2022, 8:41:18 AM
    Author     : salva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="act.Triangulo" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          Triangulo t = (Triangulo) request.getAttribute("datos");
        %>
        <h3>El perimetro es : <% out.println(t.getPerimetro()); %></h3>
        <h3>El area es : <% out.println(t.getArea()); %></h3>
    </body>
</html>
