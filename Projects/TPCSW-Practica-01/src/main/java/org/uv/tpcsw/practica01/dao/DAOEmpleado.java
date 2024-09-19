package org.uv.tpcsw.practica01.dao;

import java.util.List;

/**
 *
 * @author harlock024
 */
//crud
public class DAOEmpleado {
    

    public boolean guardar(EmpleadoPojo pojo) {
           ConexionDB con = ConexionDB.getInstace();
        String sql = "INSERT INTO empleados (clave, nombre,direccion, telefono)"
                + "('"+pojo.getClave() +"','" + pojo.getNombre() +"','" +
                pojo.getDireccion() +"','" + pojo.getTelefono() + "')";
        return con.execute(sql);
     
    }

    public boolean eliminar(EmpleadoPojo pojo) {
        
        return true;
    }

    public boolean modificar(EmpleadoPojo pojo) {
         ConexionDB con = ConexionDB.getInstace();
        String sql = "UPDATE INTO empleados (clave, nombre,direccion, telefono)"
                + "('"+pojo.getClave() +"','" + pojo.getNombre() +"','" +
                pojo.getDireccion() +"','" + pojo.getTelefono() + "')";
        return con.execute(sql);
    }

    public List<EmpleadoPojo> buscarAll(){
          String sql="select";
          return null;
    
}
    
    public EmpleadoPojo buscarByID(EmpleadoPojo pojo) {
        return null;

    }
    

}


