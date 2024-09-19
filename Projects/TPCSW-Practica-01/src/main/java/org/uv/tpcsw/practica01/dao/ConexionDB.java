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

   private static ConexionDB cx = null;

    public static ConexionDB getInstace() {
        if (cx == null) {
            cx = new ConexionDB();
        }
        return cx;
    }

    private Connection con = null;

    public ConexionDB() {

        try {
            String url = "jdbc:postgresql://localhost:5432/tpscw_practica";
            String user= "harlock024";
            String password = "123456";
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean execute (TransactionDB transaction){
        return transaction.execute(con);
    }

    public boolean execute(String sql) {
        Statement stm = null;
        try {
            stm = con.createStatement();
            return stm.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);

                }

            }

        }

    }

}
