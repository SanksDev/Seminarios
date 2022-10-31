<%-- 
    Document   : edit
    Created on : 30-oct-2022, 20:13:35
    Author     : User
--%>

<%@page import="javax.xml.bind.DatatypeConverter.parseInteger(String)"%>
<%@page import="webservice.User"%>
<%@page import="Modelo.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

    </head>
    <body>
        <div class="container mt-4">
            <div clas="card">
                <div class="card-header">
                    <h5>Actualizar Usuario:</h5>
                    <%
                        int id=parseInteger.parseInt((String)request.getAttribute("iduser"));
                    UserService user=new UserService();
                    User u = user.listarID(id);
                    %>
                </div>
                <div class="card-body">
                    <form action="Controlador">
                        <label>Id</label>
                        <input type="text" value="<%= u.getId()%>" name="txtid" readonly="" class="form-control" value="">
                        <label>Nombres</label>
                        <input type="text" value="<%= u.getFname()%>" name="txtid" readonly="" class="form-control" value="">
                        <label>Apellidos</label>
                        <input type="text" value="<%= u.getLname()%>" name="txtapellidos" class="form-control" value="">
                        <input type="submit" name="accion" value="Actualizar">
                        <a href="Controlador?accion=index">Regresar</a>
                    </form>
                </div>              
            </div>
        </div>
    </body>
</html>
