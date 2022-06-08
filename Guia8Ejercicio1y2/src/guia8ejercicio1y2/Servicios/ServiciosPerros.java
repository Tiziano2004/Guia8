/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio1y2.Servicios;

import guia8ejercicio1y2.Entidades.Perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosPerros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> razas;
    Perros v1 = new Perros();

    public ServiciosPerros() {
        this.razas = new ArrayList();
    }

    public void crearrazas() {
        String opcion = null;

        do {
            System.out.println("Ingrese la raza de la mascota");
            v1.setRazas(leer.next());
            String mascota = v1.getRazas();
            razas.add(mascota);
            System.out.println("¿Quiere seguir agregando?");
            opcion = leer.next();
        } while (!opcion.equals("No"));
        System.out.println("Se van a mostrar las razas en la lista");
        for (String aux : razas) {
            System.out.println(aux);
        }
    }

    public void Eliminarraza() {
        Iterator<String> it = razas.iterator();
        String pedido;
        System.out.println("Ingrese la raza a eliminar");
        pedido = leer.next();
        System.out.println("--------*---------");
        int bebe = 0;
        while (it.hasNext()) {
            String aux = it.next();
            
            if (aux.equals(pedido)) {
                bebe = bebe + 1;
                it.remove();
            }
            if (bebe == 0) {
                System.out.println("La raza introducida no se encuentra en la lista");
            }
        }
        for (String au : razas) {
            System.out.println(au);
        }
    }
}
