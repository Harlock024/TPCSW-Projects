/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tpcsw.practica;

/**
 *
 * @author harlock024
 */
public class MensajeConcreto {
    
   private String name ="";
   
   
    public MensajeConcreto(String name) {
        this.name= name;
    
    }
    public MensajeConcreto() {
        this.name = "Nombre";
        System.out.println("Se ejecuta Constructor");
        
    }
   
   
    
    public void imprimir(){
        System.out.println (name+ ":" +"mensaje....");
        
        
    }
    
}
