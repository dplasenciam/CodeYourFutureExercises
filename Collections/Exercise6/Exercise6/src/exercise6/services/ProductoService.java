/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6.services;

import exercise6.entities.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class ProductoService {
    
    private Scanner read;
    private Map<String, Producto> productos;

    public ProductoService() {
        read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        productos = new HashMap();
    }
    
    public void agregarProducto(){
        
        System.out.println("Ingresar nombre del producto");
        String nombreProducto = read.next();
        System.out.println("Ingrese precio $");
        Double precioProducto = read.nextDouble();
        productos.put(nombreProducto, new Producto(nombreProducto, precioProducto));
    }
    
    public void mostrarProductos(){
        
        for (Map.Entry<String, Producto> entry: productos.entrySet()){
            System.out.println("Producto: " + entry.getKey() + " Precio: " + entry.getValue().getPrecio());
        }
        
    }
    
    public void eliminarProducto(String producto){
        Producto p = productos.remove(producto);
        if(p == null){
            System.out.println("--- No se encontró el elemento a eliminar ---");
        }
    }
    
    public void modificarPrecio(String producto, Double precioNuevo){
        
        if(productos.containsKey(producto)){
            productos.get(producto).setPrecio(precioNuevo);
        } else{
            System.out.println("--- No se encontró el producto ---");
        }
        
        /*
        int contador = 0;
        for(Map.Entry<String, Producto> entry: productos.entrySet()){
            
            if(entry.getKey().equals(producto)){
                contador++;
                entry.getValue().setPrecio(precioNuevo);
            }
            
        }
        
        if(contador==0){
            System.out.println("--- No se encontró el producto ---");
        }*/
        
    }
    
}
