/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

import exercise6.entities.Producto;
import exercise6.services.ProductoService;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ProductoService ps = new ProductoService();
        int opcion;
        String productoModificar;
        Double nuevoPrecio;
        String productoEliminar;
        
        while(true){
            
            System.out.println("### MENU ###");
            System.out.println("1. Ingresar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Modificar precio de producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.println("########");
            System.out.print("Ingrese opción: ");
            opcion = read.nextInt();
            
            if(opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion!=5){
                System.out.println("--- No se ingresó una opción válida");
            } else if (opcion==5){
                break;
            } else{
                switch(opcion){
                    case 1:
                        ps.agregarProducto();
                        break;
                    case 2:
                        ps.mostrarProductos();
                        break;
                    case 3:
                        System.out.println("Ingrese producto a editar precio");
                        productoModificar = read.next();
                        System.out.println("Ingrese nuevo valor ");
                        nuevoPrecio = read.nextDouble();
                        ps.modificarPrecio(productoModificar, nuevoPrecio);
                        ps.mostrarProductos();
                        break;
                    case 4:
                        System.out.println("Ingrese producto a eliminar");
                        productoEliminar = read.next();
                        ps.eliminarProducto(productoEliminar);
                        ps.mostrarProductos();
                        break;
                }
            }
            
        }
    }
    
}
