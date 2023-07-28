/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import exercise2.services.PerroService;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        PerroService ps = new PerroService();
        int opcion;
        
        while(true){
            
            System.out.println("--- MENU ---");
            System.out.println("1. Agregar raza de perro");
            System.out.println("2. Salir");
            System.out.print("Opcion: ");
            opcion = read.nextInt();
            
            if(opcion!=1 && opcion!=2){
                System.out.println("Debe ingresar una opción válida\n");
            }else{
                switch(opcion){
                    case 1:
                        ps.crearAgregarPerro();
                        break;
                    case 2:
                        ps.mostrarPerros();
                        System.out.println("--- Eliminar raza ---");
                        System.out.print("Ingrese una raza de perro a eliminar: ");
                        ps.eliminarRazaPorNombre(read.next());
                        ps.ordenarLista();
                        ps.mostrarPerros();;
                        break;
                    default:
                        System.out.println("Usted ingresó una opción incorrecta\n");
                }
                if(opcion==2){
                    break;
                }
            }
            
        }
        
    }
    
}
