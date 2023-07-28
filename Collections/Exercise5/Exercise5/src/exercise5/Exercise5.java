/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import exercise5.services.PaisService;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        PaisService ps = new PaisService();
        int opcion;
        
        while(true){
            
            opcion=1;
            System.out.println("Ingresando pais");
            ps.ingresarPais();
            
            while(true){
                System.out.println("Desea ingresar otro país?");
                System.out.println("1. Si");
                System.out.println("2. No");
                System.out.println("Opcion: ");
                opcion = read.nextInt();
                if (opcion!=1 && opcion!=2){
                    System.out.println("Se ingresó una opción inválida");
                }else{
                    break;
                }
            }

            if (opcion == 2){
                System.out.println("--- Todos los paises ---");
                ps.mostrarPaises();
                System.out.println("--- Como se usa treeset, ya vienen ordenados con el Comparable ---");
                ps.mostrarPaises();
                System.out.println("\nIngresar un pais a eliminar: ");
                ps.eliminarPaisPorNombre(read.next());
                System.out.println("--- Mostrando paises ---");
                ps.mostrarPaises();
                break;
            }
        }
        
    }
    
}
