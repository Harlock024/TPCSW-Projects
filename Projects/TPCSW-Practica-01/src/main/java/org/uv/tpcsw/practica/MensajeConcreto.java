package org.uv.tpcsw.practica;

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
        System.out.println("Se ejecuta Constructor");
        
    }
  
   @Override
    public void imprimir(){
        System.out.println (name+ ":" +"mensaje....");
        
        
    }

    @Override
    protected void msg() {
    }
    
}
