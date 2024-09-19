package org.uv.tpcsw.practica;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harlock024
 */
public class MensajeConcreto extends Mensaje{
    
   private String name ="";
   
    public MensajeConcreto(String name) {
        this.name= name;
    
    }
    public MensajeConcreto() {
        this.name = "Nombre";
              Logger.getLogger(Despedida.class.getName()).log(Level.INFO, "se ejecuta constructor...");

        
    }
  
   @Override
    public void imprimir(){
              Logger.getLogger(Despedida.class.getName()).log(Level.INFO, "{0}mensaje..", name);

        
        
    }

    @Override
    protected void msg() {
                Logger.getLogger(Despedida.class.getName()).log(Level.INFO, "ADIOS MUNDO...");

    }
    
}
