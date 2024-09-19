package org.uv.tpcsw.practica;

import org.uv.tpcsw.practica01.dao.ConexionDB;
import org.uv.tpcsw.practica01.dao.EmpleadoPojo;
import org.uv.tpcsw.practica01.inyeccion.EmpleadoServices;

public class TPCSWPractica01 {

    public static void main(String[] args) {

        ConexionDB con = ConexionDB.getInstace();

        EmpleadoServices empleadoServices = new EmpleadoServices(con);

      EmpleadoPojo pojo = new EmpleadoPojo();
        pojo.setClave("03");
        pojo.setNombre("hadith");
        pojo.setDireccion("av 1");
        pojo.setTelefono("242424");

        EmpleadoPojo pojo2 = new EmpleadoPojo();
        pojo2.setClave("02");
        pojo2.setNombre("luis");
        pojo2.setDireccion("av 2");
        pojo2.setTelefono("34354t5");

        boolean insert = empleadoServices.insert(pojo2);
        if (insert) {
            System.out.println("empleado insertado");
        } else {
            System.out.println("errro ");

        }
        if (empleadoServices.read("03")) {
            EmpleadoPojo empleado = empleadoServices.getEmpleadoInfo();
            System.out.println(empleado.getNombre());
        } else {
            System.out.println("no se pudo leer el empleado");
        }

        EmpleadoPojo empleadoActualizado = new EmpleadoPojo();
        empleadoActualizado.setClave("03");
        empleadoActualizado.setNombre("victor");
        empleadoActualizado.setDireccion("av 2");
        empleadoActualizado.setTelefono("2343552");

        boolean actualizado = empleadoServices.update(empleadoActualizado);
        if (actualizado) {
            System.out.println("empleado actualizado");
        } else {
            System.out.println("Error");
        }

        if (empleadoServices.read("02")) {
            EmpleadoPojo empleado = empleadoServices.getEmpleadoInfo();
            System.out.println(empleado.getNombre());
        } else {
            System.out.println("no se pudo leer el empleado");
        }

     
     boolean eliminar = empleadoServices.delete("02");
     if(eliminar){
         System.out.println("Empleado eliminado");
     }else{
         System.out.println("Error");
     }
     
         if (empleadoServices.read("02")) {
            EmpleadoPojo empleado = empleadoServices.getEmpleadoInfo();
            System.out.println(empleado.getNombre());
        } else {
            System.out.println("no se pudo leer el empleado");
        }
     
   
    }
    

}
