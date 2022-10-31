
package Modelo;

import java.util.List;


public interface CRUD {
    public List listar();
    public User listarID(int id);
    public String add(String nombre, String ape);
    public String edit(int id, String nombre, String ape);
    public User delete(int id);

}
