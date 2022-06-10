/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio5.Servicios;

import guia8ejercicio5.Entidades.Comparadores;
import guia8ejercicio5.Entidades.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ServiciosPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashSet<String> paises = new HashSet();
    Paises v1 = new Paises();

    public void CrearPaises() {
        do {
            System.out.println(" Ingrese el pais ");
            v1.setPaises(leer.next());
            String paises1 = v1.getPaises();
            paises.add(paises1);
            System.out.println(" ¿Quiere agregar otro pais? ");
        } while (leer.next().equalsIgnoreCase("Si"));

        System.out.println(" ---------------------*---------------- ");
        System.out.println(" Se van a mostrar los paises ");
        System.out.println(" ---------------------*---------------- ");
        for (Object aux : paises) {
            System.out.println(aux);
        }
    }

    public void Paisesalfabeticos() {
        ArrayList<String> paiseslist = new ArrayList(paises);
        System.out.println(" ---------------------*-------------------");
        System.out.println(" Se van a mostrar los paises ordenados alfabeticamente ");
        System.out.println(" ---------------------*-------------------");
        Collections.sort(paiseslist);
        for (String aux : paiseslist) {
            System.out.println(aux);
        }
    }

    public void EliminarPais() {
        Iterator<String> it = paises.iterator();
        int a = 0;
        System.out.println(" Ingrese el pais que quiere eliminar ");
        String pedido = leer.next();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(pedido)) {
                it.remove();
                a = 1;
            }
        }
         if (a == 0) {
                System.out.println(" El pais no se encuentra en la lista ");
            }
        System.out.println(" ---------------------*-------------------");
        System.out.println(" Mostrando lista ");
        System.out.println(" ---------------------*-------------------");
        for (String aux : paises) {
            System.out.println(aux);
        }
    }
}
