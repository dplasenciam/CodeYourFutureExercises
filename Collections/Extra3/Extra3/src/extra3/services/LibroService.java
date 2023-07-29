/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3.services;

import extra3.entities.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Daniel Plasencia
 */
public class LibroService {
    
    Scanner read;
    Set<Libro> libros;

    public LibroService() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.libros = new HashSet();
    }
    
    private Libro crearLibro(){
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = read.next();
        System.out.print("Ingrese el nombre del autor del libro: ");
        String autor = read.next();
        System.out.print("Ingrese el numero de ejemplares totales: ");
        Integer ejemplares = read.nextInt();
        return new Libro(titulo, autor, ejemplares);
    }
    
    private void agregarSet(Libro lib){
        if(!(this.libros.add(lib))){
            System.out.println("--- El libro ya existe ---");
        }
    }
    
    public void agregarLibro(){
        agregarSet(crearLibro());
    }
    
    public void mostrarLibros(){
        this.libros.forEach((aux) -> {
            System.out.println(aux);
        });
    }
    
    public void prestamo(String tituloLibro){
        Iterator<Libro> it = this.libros.iterator();
        int contador = 0;
        while(it.hasNext()){
            Libro aux = it.next();
            if(aux.getTitulo().equals(tituloLibro)){
                contador++;
                if(prestarLibro(aux)){
                    System.out.println("--- Se prestó 1 ejemplar del libro "+aux.getTitulo());
                }else{
                    System.out.println("--- No se puede prestar libros pues están prestados todos ("+aux.getNumeroEjemplaresPrestados()+"/"+aux.getNumeroEjemplares()+")");
                }
            }
        }
        if(contador==0){
            System.out.println("--- No se encontró el libro ---");
        }
    }

    private boolean prestarLibro(Libro lib){
        
        Integer prestados = lib.getNumeroEjemplaresPrestados();
        Integer total = lib.getNumeroEjemplares();
        if(prestados<total){
            lib.setNumeroEjemplaresPrestados(prestados+1);
            return true;
        }else{
            return false;
        }
        
    }

    public void devolucion(String tituloLibro){
        Iterator<Libro> it = this.libros.iterator();
        int contador = 0;
        while(it.hasNext()){
            Libro aux = it.next();
            if(aux.getTitulo().equals(tituloLibro)){
                contador++;
                if(devolverLibro(aux)){
                    System.out.println("--- Se devolvió 1 ejemplar del libro "+aux.getTitulo());
                }else{
                    System.out.println("--- No se puede devolver libros pues no hay nada prestado ("+aux.getNumeroEjemplaresPrestados()+"/"+aux.getNumeroEjemplares()+")");
                }
            }
        }
        if(contador==0){
            System.out.println("--- No se encontró el libro ---");
        }
    }
    
    private boolean devolverLibro(Libro lib){
        
        Integer prestados = lib.getNumeroEjemplaresPrestados();
        Integer total = lib.getNumeroEjemplares();
        if(prestados>0){
            lib.setNumeroEjemplaresPrestados(prestados-1);
            return true;
        }else{
            return false;
        }
        
    }
    
}
