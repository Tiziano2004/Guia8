/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejericio4;

import guia8ejericio4.Entidades.Pelicula;
import guia8ejericio4.Servicios.ServiciosPelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Guia8Ejericio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosPelicula v1 = new ServiciosPelicula();
        do { v1.crearPelicula();
            v1.crearPelicula();
            System.out.println(" ¿Quiere agregar otra pelicula? ");
        } while (leer.next().equalsIgnoreCase("Si"));
        v1.MostrarPeliculas(peliculas);
        v1.Peliculasconmayorduracion(peliculas);
        v1.PeliculaMasde1hora();
        v1.PeliculaMenosde1hora();
        v1.Peliculaseguntitulo();
        v1.Peliculasegundirector();
    }

}
