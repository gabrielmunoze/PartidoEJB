<%-- 
    Document   : salidas
    Created on : 17-may-2017, 21:37:13
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="clases.Partido" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<Partido> lista =(ArrayList<Partido>)
            request.getSession().getAttribute("partidos");
            
            for(int i= 0; i<lista.size(); i++){
                out.println("Fecha: "+ lista.get(i).getFecha() +"<br/>");
                out.println("Equipo1: "+ lista.get(i).getEquipo1() + " Goles " + lista.get(i).getGoles1()+"<br/>");
                out.println("Equipo2: "+ lista.get(i).getEquipo2() + " Goles " + lista.get(i).getGoles2()+"<br/>");
                out.println("<hr />");
            }
        %>
    </body>
</html>
