package org.uv.tpcsw.practica;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harlock024
 */
public class Singleton {

    private static Singleton sin = null;

    public static Singleton getInstance() {
        if (sin == null) {
            sin = new Singleton();
        }
        return sin;
    }

    private Singleton() {

    }

    public void imprimir() {
          Logger.getLogger(Despedida.class.getName()).log(Level.INFO, "mensaje..");
    }

}
