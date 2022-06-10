/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejericio4.Servicios;

import guia8ejericio4.Entidades.Comparadores;
import guia8ejericio4.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ServiciosPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList();

    public void crearPelicula() {
        Pelicula v1 = new Pelicula();
        System.out.println(" Ingrese el titulo de la pelicula ");
        v1.setTitulo(leer.next());
        System.out.println(" Ingrese el director de la pelicula ");
        v1.setDirector(leer.next());
        System.out.println(" Ingrese la duracion de la pelicula ");
        v1.setDuracion(leer.nextInt());
        peliculas.add(v1);
    }

    public void MostrarPeliculas(ArrayList Pelicula) {
        System.out.println(" ---------------------*-------------------");
        System.out.println(" Vamos a mostrar las peliculas ");
        System.out.println(" ---------------------*-------------------");
        for (Pelicula aux : peliculas) {
            System.out.println(" La pelicula es " + aux.getTitulo() + " , el director es " + aux.getDirector() + " y  la pelicula dura " + aux.getDuracion() + " horas ");
        }
    }

    public void Peliculasconmayorduracion(ArrayList Pelicula) {
        System.out.println(" ---------------------*-------------------");
        System.out.println(" Se van a mostrar las peliculas con mayor duracion ");
        System.out.println(" ---------------------*-------------------");
        for (Pelicula aux : peliculas) {
            if (aux.getDuracion() >= 2) {
                System.out.println(" La pelicula es " + aux.getTitulo() + " , el director es " + aux.getDirector() + " y  la pelicula dura " + aux.getDuracion() + " horas ");
            }
        }
    }

    public void PeliculaMasde1hora() {
        System.out.println(" ---------------------*-------------------");
        System.out.println(" Se van a mostrar las peliculas ordenadas segun su duracion de mayor a menor ");
        System.out.println(" ---------------------*-------------------");
        Collections.sort(peliculas, Comparadores.mayorduracion);
        for (Pelicula aux : peliculas) {
            System.out.println(" La pelicula es " + aux.getTitulo() + " , el director es " + aux.getDirector() + " y  la pelicula dura " + aux.getDuracion() + " horas ");
        }
    }

    public void PeliculaMenosde1hora() {
        System.out.println(" ---------------------*-------------------");
        System.out.println(" Se van a mostrar las peliculas ordenadas segun su duracion de menor a mayor ");
        System.out.println(" ---------------------*-------------------");
        Collections.sort(peliculas, Comparadores.menorduracion);
        for (Pelicula aux : peliculas) {
            System.out.println(" La pelicula es " + aux.getTitulo() + " , el director es " + aux.getDirector() + " y  la pelicula dura " + aux.getDuracion() + " horas ");
        }
    }
    public void Peliculaseguntitulo(){
        System.out.println(" ---------------------*-------------------");
        System.out.println(" Se van a mostrar las peliculas ordenadas alfabeticamente segun el titulo ");
        System.out.println(" ---------------------*-------------------");
        Collections.sort(peliculas, Comparadores.Titulo);
        for (Pelicula aux : peliculas) {
            System.out.println(" La pelicula es " + aux.getTitulo() + " , el director es " + aux.getDirector() + " y  la pelicula dura " + aux.getDuracion() + " horas ");
        }
    }
    public void Peliculasegundirector(){
        System.out.println(" ---------------------*-------------------");
        System.out.println(" Se van a mostrar las peliculas ordenadas alfabeticamente segun el director ");
        System.out.println(" ---------------------*-------------------");
        Collections.sort(peliculas, Comparadores.Director);
        for (Pelicula aux : peliculas) {
            System.out.println(" La pelicula es " + aux.getTitulo() + " , el director es " + aux.getDirector() + " y  la pelicula dura " + aux.getDuracion() + " horas ");
        }
    }
}
