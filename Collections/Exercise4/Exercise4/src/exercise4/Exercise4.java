/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import exercise4.services.PeliculaService;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        PeliculaService ps = new PeliculaService();
        int opcion;
        
        System.out.println("Ingresando Pelicula....");
        ps.ingresarPelicula();
        
        while(true){
            
            System.out.println("¿Desea ingresar otra película?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            System.out.print("Opcion: ");
            opcion = read.nextInt();
            
            if (opcion!=1 && opcion!=2){
                System.out.println("Ingrese una opción correcta");
            } else if (opcion == 2){
                ps.mostrarPeliculas();
                System.out.println("--- Peliculas de mas de 1 hora ---");
                ps.mostrarPeliculasMayor1h();
                ps.ordenarLista(3);
                System.out.println("--- Peliculas ordenadas de mayor a menor duracion ---");
                ps.mostrarPeliculas();
                ps.ordenarLista(4);
                System.out.println("--- Peliculas ordenadas de menor a mayor duracion ---");
                ps.mostrarPeliculas();
                ps.ordenarLista(1);
                System.out.println("--- Peliculas ordenadas alfabeticamente por titulo");
                ps.mostrarPeliculas();
                ps.ordenarLista(2);
                System.out.println("--- Peliculas ordenadas alfabeticamente por director");
                ps.mostrarPeliculas();
                break;
            } else{
                System.out.println("Ingresando Pelicula....");
                ps.ingresarPelicula();
            }
            
        }
        
    }
    
}
