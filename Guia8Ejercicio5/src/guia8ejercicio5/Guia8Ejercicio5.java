/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio5;

import guia8ejercicio5.Servicios.ServiciosPais;

/**
 *
 * @author angel
 */
public class Guia8Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ServiciosPais l1 = new ServiciosPais();
            
            l1.CrearPaises();
            l1.Paisesalfabeticos();
            l1.EliminarPais();
    }
    
}
