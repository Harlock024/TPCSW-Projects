/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tpcsw.practica;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harlock024
 */
public class Despedida2  implements  IMensaje{

    @Override
    public void imprimir() {
        Logger.getLogger(Despedida.class.getName()).log(Level.INFO, "ADIOS MUNDO 2...");
    }
     
}
