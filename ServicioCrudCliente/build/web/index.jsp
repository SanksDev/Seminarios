<%-- 
    Document   : index
    Created on : 30-oct-2022, 17:31:47
    Author     : User
--%>

<%@page import="webservice.User"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-4">
            <div clas="card">
                <div class="card-header">
                    <a href="Controlador?accion=add" class="btn btn-primary ">Nuevo integrante</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRES</th>
                                <th>APELLIDOS</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            UserService user=new UserService();
                            List<User> datos=user.listar();
                            for(User u:datos){

                            %>
                            <tr>
                                <td><%= u.getId()%></td>
                                <td><%= u.getFname()%></td>
                                <td><%= u.getLname()%></td>
                                <td>
                                    <a href="Controlador?accion=editar&id<%= u.getId()%>" class="btn btn-warning">Edit</a>
                                    <a href="Controlador?accion=eliminar&id<%= u.getId()%>" class="btn btn-danger">Delete</a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>              
            </div>
        </div>
    </body>
</html>
