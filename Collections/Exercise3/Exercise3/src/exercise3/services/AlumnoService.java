/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3.services;

import exercise3.entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class AlumnoService {
    
    private Scanner read;
    private ArrayList<Alumno> alumnos;

    public AlumnoService() {
        this.alumnos = new ArrayList();
        this.read = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void cargarAlumnos(){
        agregarAlumnos(crearAlumno());
    }
    
    public Alumno crearAlumno(){
        System.out.print("Ingrese nombre: ");
        String nombre = read.next();
        System.out.println("Ingrese nota 1: ");
        Double nota1 = read.nextDouble();
        System.out.println("Ingrese nota 2: ");
        Double nota2 = read.nextDouble();
        System.out.println("Ingrese nota 3: ");
        Double nota3 = read.nextDouble();
        ArrayList<Double> listaNotas = new ArrayList();
        listaNotas.add(nota1);
        listaNotas.add(nota2);
        listaNotas.add(nota3);
        return new Alumno(nombre, listaNotas);
    }
    
    public void agregarAlumnos(Alumno a){
        this.alumnos.add(a);
    }
    
    public Double obtenerNotaFinal(Alumno a){
        ArrayList<Double> lista = a.getNotas();
        return (lista.get(0) + lista.get(1) + lista.get(2))/3.0;
    }
    
    public void notaFinalPorAlumno(String nombre){
        int contador = 0;
        for(Alumno aux: alumnos){
            if (aux.getNombre().equals(nombre)){
                contador++;
                System.out.println("El promedio del alumno es " + obtenerNotaFinal(aux));
            }
        }
        if (contador==0){
            System.out.println("No se encontró ningún alumno con ese nombre");
        }
    }
    
}
