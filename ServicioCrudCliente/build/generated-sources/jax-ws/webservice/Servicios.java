
package webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicios", targetNamespace = "http://WebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicios {


    /**
     * 
     * @param id
     * @return
     *     returns webservice.User
     */
    @WebMethod(operationName = "Eliminar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Eliminar", targetNamespace = "http://WebService/", className = "webservice.Eliminar")
    @ResponseWrapper(localName = "EliminarResponse", targetNamespace = "http://WebService/", className = "webservice.EliminarResponse")
    @Action(input = "http://WebService/Servicios/EliminarRequest", output = "http://WebService/Servicios/EliminarResponse")
    public User eliminar(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param id
     * @return
     *     returns webservice.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarID", targetNamespace = "http://WebService/", className = "webservice.ListarID")
    @ResponseWrapper(localName = "listarIDResponse", targetNamespace = "http://WebService/", className = "webservice.ListarIDResponse")
    @Action(input = "http://WebService/Servicios/listarIDRequest", output = "http://WebService/Servicios/listarIDResponse")
    public User listarID(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<webservice.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://WebService/", className = "webservice.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://WebService/", className = "webservice.ListarResponse")
    @Action(input = "http://WebService/Servicios/listarRequest", output = "http://WebService/Servicios/listarResponse")
    public List<User> listar();

    /**
     * 
     * @param apellidos
     * @param nombres
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregar", targetNamespace = "http://WebService/", className = "webservice.Agregar")
    @ResponseWrapper(localName = "agregarResponse", targetNamespace = "http://WebService/", className = "webservice.AgregarResponse")
    @Action(input = "http://WebService/Servicios/agregarRequest", output = "http://WebService/Servicios/agregarResponse")
    public String agregar(
        @WebParam(name = "nombres", targetNamespace = "")
        String nombres,
        @WebParam(name = "apellidos", targetNamespace = "")
        String apellidos);

    /**
     * 
     * @param apellidos
     * @param id
     * @param nombres
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Actualizar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Actualizar", targetNamespace = "http://WebService/", className = "webservice.Actualizar")
    @ResponseWrapper(localName = "ActualizarResponse", targetNamespace = "http://WebService/", className = "webservice.ActualizarResponse")
    @Action(input = "http://WebService/Servicios/ActualizarRequest", output = "http://WebService/Servicios/ActualizarResponse")
    public String actualizar(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "nombres", targetNamespace = "")
        String nombres,
        @WebParam(name = "apellidos", targetNamespace = "")
        String apellidos);

}
