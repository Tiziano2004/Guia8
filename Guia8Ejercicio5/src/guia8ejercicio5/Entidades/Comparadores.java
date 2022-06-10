/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio5.Entidades;

import java.util.Comparator;



/**
 *
 * @author angel
 */
public class Comparadores {
    public static Comparator<Paises> mayorduracion = new Comparator<Paises>() {
      
 @Override
        public int compare(Paises t, Paises t1) {
           return t.getPaises().compareTo(t1.getPaises());
        }
    };
    
}
