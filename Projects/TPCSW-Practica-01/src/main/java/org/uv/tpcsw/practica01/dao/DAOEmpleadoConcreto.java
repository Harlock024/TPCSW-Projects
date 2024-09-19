package org.uv.tpcsw.practica01.dao;

import java.util.List;

/**
 *
 * @author harlock024
 */
public class DAOEmpleadoConcreto implements IDAOGeneral<EmpleadoPojo, String> {

    @Override
    public boolean save(EmpleadoPojo pojo) {
//        ConexionDB con = ConexionDB.getInstace();
//        String sql = "INSERT INTO empleados (clave, nombre,direccion, telefono)"
//                + "('"+pojo.getClave() +"','" + pojo.getNombre() +"','" +
//                pojo.getDireccion() +"','" + pojo.getTelefono() + "')";
//        return con.execute(sql);
        return true;
    }

    @Override
    public boolean delete(String id) {
//        ConexionDB con = ConexionDB.getInstace();
//        String sql = "DELETE empleados (clave, nombre,direccion, telefono)"
//                + "('"+pojo.getClave() +"','" + pojo.getNombre() +"','" +
//                pojo.getDireccion() +"','" + pojo.getTelefono() + "')";
//        return con.execute(sql);
        return true;
    }

    @Override
    public boolean update(EmpleadoPojo pojo, String id) {
        return true;
    }

    @Override
    public List<EmpleadoPojo> findAll() {
        return null;
    }

    @Override
    public EmpleadoPojo findById(String id) {
        return null;
    }

}
