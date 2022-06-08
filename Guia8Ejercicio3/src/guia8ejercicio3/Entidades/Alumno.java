/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio3.Entidades;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Alumno {
    private String nombre;
    private ArrayList <Integer> Notas;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> Notas) {
        this.nombre = nombre;
        this.Notas = Notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Integer> Notas) {
        this.Notas = Notas;
    }
    
    public double NotaFinal(Alumno a1){
        int suma = 0;
        for (Integer aux : a1.getNotas()) {
            suma += aux;
        }
        return (double) suma / 3;
    }
}
