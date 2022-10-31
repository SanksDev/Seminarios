/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Modelo.User;
import Modelo.UserDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Servicios")
public class Servicios {
    UserDAO dao=new UserDAO();
    @WebMethod(operationName = "listar")
    public List<User> listar() {
        List datos=dao.listar();
        return datos;
    }


    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "nombres") String nombres, @WebParam(name = "apellidos") String apellidos) {
        String datos=dao.add(nombres, apellidos);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarID")
    public User listarID(@WebParam(name = "id") int id) {
        User user=dao.listarID(id);
        return user;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Actualizar")
    public String Actualizar(@WebParam(name = "id") int id, @WebParam(name = "nombres") String nombres, @WebParam(name = "apellidos") String apellidos) {
        String datos=dao.edit(id, nombres, apellidos);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Eliminar")
    public User Eliminar(@WebParam(name = "id") int id) {
        User u=dao.delete(id);
        
        return u;
    }
}
