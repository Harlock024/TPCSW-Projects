
package org.uv.tpcsw.practica01.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harlock024
 */
public class ConexionDB {
    
    
    public static ConexionDB cx=null;
    
     static ConexionDB cn=null;
    
    public static ConexionDB getInstace(){
        if(cx==null){
            cx = new ConexionDB();
        }
        return cx;
    }
    
    
    Connection con = null;
    
   
    public ConexionDB(){
        
        
        
          try{
        String url="jbdc:postgressql://localhost:5432/ejemplo";
        con=DriverManager.getConnection(url,"postgres","postgres");
               
        }catch(SQLException ex){
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE,null,ex);
    }
}
    

    

        
    public boolean execute(String sql){
        try{
            Statement stm= con.createStatement();
            return stm.execute(sql);
          
        }catch(SQLException ex){
              Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE,null,ex);
             return false;
        
        }
       
    }
}
