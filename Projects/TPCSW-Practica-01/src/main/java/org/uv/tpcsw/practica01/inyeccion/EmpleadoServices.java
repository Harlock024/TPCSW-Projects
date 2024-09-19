package org.uv.tpcsw.practica01.inyeccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uv.tpcsw.practica.TPCSWPractica01;
import org.uv.tpcsw.practica01.dao.ConexionDB;
import org.uv.tpcsw.practica01.dao.EmpleadoPojo;
import org.uv.tpcsw.practica01.dao.TransactionDB;

/**
 *
 * @author harlock024
 */
public class EmpleadoServices {

    private ConexionDB con;
    private EmpleadoPojo empleadoLeido;

    public EmpleadoServices(ConexionDB con) {
        this.con = con;

    }

    public boolean insert(EmpleadoPojo pojo) {
        TransactionDB<EmpleadoPojo> insertarEmpleado = new TransactionDB<EmpleadoPojo>(pojo) {
            @Override
            public boolean execute(Connection con) {
                String sql = "INSERT INTO empleados (clave,nombre,direccion,telefono) VALUES (?,?,?,?) ";
                try (PreparedStatement pst = con.prepareStatement(sql)) {
                    pst.setString(1, pojo.getClave());
                    pst.setString(2, pojo.getNombre());
                    pst.setString(3, pojo.getDireccion());
                    pst.setString(4, pojo.getTelefono());
                    int rowsAffected = pst.executeUpdate();
                    return rowsAffected > 0;
                } catch (SQLException ex) {
                    Logger.getLogger(TPCSWPractica01.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }

        };
        return con.execute(insertarEmpleado);
    }

    public boolean read(String clave) {
        TransactionDB<String> leerEmpleado = new TransactionDB<String>(clave) {
            @Override
            public boolean execute(Connection con) {
                String sql = "SELECT * FROM empleados WHERE clave=?";
                System.out.println("Cosulta "+ sql +"clave"+ clave);
                try (PreparedStatement pst = con.prepareStatement(sql)) {
                    pst.setString(1, clave);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                  
                        empleadoLeido  = new EmpleadoPojo();
                        empleadoLeido.setClave(rs.getString("clave"));
                        empleadoLeido.setNombre(rs.getString("nombre"));
                        empleadoLeido.setDireccion(rs.getString("direccion"));
                        empleadoLeido.setTelefono(rs.getString("telefono"));
                        return true;
                        
                       
                    } else {
                        Logger.getLogger(EmpleadoServices.class.getName()).log(Level.SEVERE, "empleado no encotrado ,Clave:{0}",clave);

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(EmpleadoServices.class.getName()).log(Level.SEVERE, null, ex);
                }
                return false;
            }
           
        };
         return con.execute(leerEmpleado);
        
    }

    public EmpleadoPojo getEmpleadoInfo() {
       return  empleadoLeido;
    }

    public boolean update(EmpleadoPojo pojo) {
        TransactionDB<EmpleadoPojo> actualizarEmpleado = new TransactionDB<EmpleadoPojo>(pojo) {
            @Override
            public boolean execute(Connection con) {
                String sql = "UPDATE empleados SET nombre=?, direccion=?, telefono=? WHERE clave= ?";
                try (PreparedStatement pst = con.prepareStatement(sql)) {
                    pst.setString(1, pojo.getNombre());
                    pst.setString(2, pojo.getDireccion());
                    pst.setString(3, pojo.getTelefono());
                    pst.setString(4, pojo.getClave());
                    int rowAffected = pst.executeUpdate();
                    return rowAffected > 0;
                } catch (SQLException ex) {
                    Logger.getLogger(EmpleadoServices.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }
        };
        return con.execute(actualizarEmpleado);
    }

    public boolean delete(String clave) {
        TransactionDB<String> elimiarEmpleado = new TransactionDB<String>(clave) {
            @Override
            public boolean execute(Connection con) {
                String sql = "DELETE FROM empleados WHERE clave = ? ";
                try (PreparedStatement pst = con.prepareStatement(sql)) {
                    pst.setString(1, clave);
                    int rowAffected = pst.executeUpdate();
                    return rowAffected > 0;
                } catch (SQLException ex) {
                    Logger.getLogger(EmpleadoServices.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }

            }
        };
        return con.execute(elimiarEmpleado);
    }
}
