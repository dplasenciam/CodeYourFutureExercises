/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4.main;

import extra4.services.CodigoPostalService;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        CodigoPostalService cps = new CodigoPostalService();
        
        // solo pruebo 4 y no 10
        for (int i = 0; i < 10; i++) {
            cps.agregarCodigoPostal();
        }
        
        System.out.println("--- Se muestra las ciudades ---");
        cps.mostrarCodigoPostal();
        
        System.out.println("--- Buscar ciudad ---");
        System.out.print("Ingresar codigo postal: ");
        cps.buscarCodigoPostal(read.next());
        
        System.out.println("\n--- Se muestra las ciudades ---");
        cps.mostrarCodigoPostal();
        
        System.out.println("\n--- Agregando nueva ciudad ---");
        cps.agregarCodigoPostal();
        
        System.out.println("--- Elimando 2 ciudades ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese codigo postal de ciudad a eliminar: ");
            cps.eliminarPorCodigoPostal(read.next());
        }
        
        System.out.println("--- Se muestra las ciudades ---");
        cps.mostrarCodigoPostal();
    }
    
}
