/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2.main;

import extra2.services.CantanteFamosoService;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        CantanteFamosoService cfs = new CantanteFamosoService();
        int opcion;
        String eliminar;
        
        System.out.println("--- Se ingresará 5 cantantes ---");
        
        for (int i = 0; i <5; i++) {
            System.out.println("Agregando cantante #"+(i+1));
            cfs.agregarCantante();
        }
        System.out.println("");
        System.out.println("--- Mostrando todos los cantantes ---");
        cfs.mostrarCantantes();
        System.out.println("");
        
        
        
        while(true){
            
            System.out.println("### MENU ###");
            System.out.println("1. Ingresar un cantante más");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante por nombre");
            System.out.println("4. Salir del programa");
            System.out.print("Ingrese opcion: ");
            opcion = read.nextInt();
            
            if(opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4){
                System.out.println("Ingresó una opción no válida");
            } else{
                switch(opcion){
                    case 1:
                        System.out.println("--- Ingresando nuevo cantante ---");
                        cfs.agregarCantante();
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("--- Mostrando todos los cantantes ---");
                        cfs.mostrarCantantes();
                        System.out.println("");
                        break;
                    case 3:
                        System.out.print("Ingres el nombre del cantante a eliminar: ");
                        cfs.eliminarCantantePorNombre(read.next());
                        break;
                    case 4:
                        System.out.println("\n--- Mostrando todos los cantantes ---");
                        cfs.mostrarCantantes();
                        System.out.println("--- Fin ---");
                        break;
                    default:
                        System.out.println("Ingresó una opción no válida\n");
                }
                if(opcion==4){
                    break;
                }
            }
            
        }
        
    }
    
}
