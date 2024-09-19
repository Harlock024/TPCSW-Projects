/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tpcsw.practica01.inyeccion;

/**
 *
 * @author harlock024
 */
public class DespedidaConcreta implements  IMensajeID{
    
    @Override
    public void imprimir(){
        System.out.println("adios mundo id");
    }
    
}
