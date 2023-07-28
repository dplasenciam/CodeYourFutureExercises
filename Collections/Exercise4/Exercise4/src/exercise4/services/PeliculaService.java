/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4.services;

import exercise4.entitites.Pelicula;
import exercise4.utilities.PeliculaComparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class PeliculaService {
    
    private Scanner read;
    private List<Pelicula> peliculas;

    public PeliculaService() {
        this.read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        this.peliculas = new ArrayList();
    }
    
    private Pelicula crearPelicula(){
        System.out.print("Ingrese el nombre de la pelicula: ");
        String nombrePelicula = read.next();
        System.out.print("Ingrese el nombre del director: ");
        String directorPelicula = read.next();
        System.out.print("Ingrese la duración de la película en horas: ");
        Double duracionPelicula = read.nextDouble();
        return new Pelicula(nombrePelicula, directorPelicula, duracionPelicula);
    }
    
    private void agregarPelicula(Pelicula p){
        this.peliculas.add(p);
    }
    
    public void ingresarPelicula(){
        agregarPelicula(crearPelicula());
    }
    
    /**
     * 
     * @param opcion = 1 -> titulo descendente
     * 2 -> director descendente
     * 3 -> duracion descendente
     * 4 -> duracion ascendente
     */
    public void ordenarLista(int opcion){
        
        switch(opcion){
            case 1:
                ordenarTituloDesc();
                break;
            case 2:
                ordenarDirectorDesc();
                break;
            case 3:
                ordenarDuracionDesc();
                break;
            case 4:
                ordenarDuracionAsc();
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        
    }
    
    private void ordenarTituloDesc(){
        Collections.sort(this.peliculas, PeliculaComparators.ordenarPorTituloAsc);
    }

    private void ordenarDirectorDesc(){
        Collections.sort(this.peliculas, PeliculaComparators.ordenarPorDirectorAsc);
    }
    
    private void ordenarDuracionDesc(){
        Collections.sort(this.peliculas, PeliculaComparators.ordenarPorDuracionDesc);
    }
    
    private void ordenarDuracionAsc(){
        Collections.sort(this.peliculas, PeliculaComparators.ordenarPorDuracionAsc);
    }
    
    public void mostrarPeliculas(){
        this.peliculas.forEach((e)->System.out.println(e));
    }
    
    public void mostrarPeliculasMayor1h(){
        for(Pelicula aux : peliculas){
            if(aux.getHoras()>1){
                System.out.println(aux);
            }
        }
    }
    
}
