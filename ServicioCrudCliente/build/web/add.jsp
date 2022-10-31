<%-- 
    Document   : add
    Created on : 30-oct-2022, 19:36:49
    Author     : User
--%>

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
                    <h5>Agregar Usuario al seminario:</h5>
                </div>
                <div class="card-body">
                    <form action="Controlador">
                        <label>Nombres</label>
                        <input type="text" name="txtnom" class="form-control">
                        <label>Apellidos</label>
                        <input type="text" name="txtapellidos" class="form-control">
                        <input type="submit" name="accion" value="Guardar">
                        <a href="Controlador?accion=index">Regresar</a>
                    </form>
                </div>              
            </div>
        </div>
    </body>
</html>
