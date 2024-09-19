
package org.uv.tpcsw.practica;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harlock024
 */
public class Despedida extends Mensaje{
    

    @Override
    public void msg() {
        Logger.getLogger(Despedida.class.getName()).log(Level.INFO, "ADIOS MUNDO...");

    }
}
