/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3.main;

import extra3.services.LibroService;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        LibroService ls = new LibroService();
        int opcion;
        
        System.out.println("--- Ingresando libro ---");
        ls.agregarLibro();
        
        while(true){
            System.out.println("### MENU ###");
            System.out.println("1. Ingresar otro libro");
            System.out.println("2. Prestar Libro");
            System.out.println("3. Devolver Libro");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = read.nextInt();
            
            if (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion!=5){
                System.out.println("Debes ingresar una opcion valida");
            } else if (opcion==5){
                System.out.println("--- Saliendo ---");
                break;
            } else{
                switch(opcion){
                    case 1:
                        System.out.println("--- Ingresando otro libro ---");
                        ls.agregarLibro();
                        break;
                    case 2:
                        System.out.println("--- Prestandose un libro ---");
                        System.out.print("Ingrese nombre del libro a prestarse: ");
                        ls.prestamo(read.next());
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("--- Devolviendo un libro ---");
                        System.out.print("Ingrese nombre del libro a devolver: ");
                        ls.devolucion(read.next());
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("--- Listando libros ---");
                        ls.mostrarLibros();
                        System.out.println("");
                        break;
                    default:
                        System.out.println("--- Error ----");
                } 
            }
            
        }
        
        
    }
    
}
