
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Modelo.*"%>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Obras</title>
    </head>
    <body>
        <h1>Obras de Arte</h1>
        <div align="center" style="margin-top: 50px;">
        <form action="CrunchifyServlet">
           nombre:  <input type="text" name="nombre" size="20px"> <br>
           descripcion:  <input type="text" name="descripcion" size="20px"> <br><br>
           estilo:  <input type="text" name="estilo" size="20px"> <br><br>
           valor:  <input type="text" name="valor" size="20px"> <br><br>
           usuario:  <input type="text" name="usuario" size="20px"> <br><br>
           
        <input type="submit" value="submit">
        </form>
     </div>
        
    
 
    </body>
</html>
