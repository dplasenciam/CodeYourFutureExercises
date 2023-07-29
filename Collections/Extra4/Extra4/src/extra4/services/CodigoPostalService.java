/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4.services;

import extra4.entities.CodigoPostal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class CodigoPostalService {
    
    private Map<String, CodigoPostal> ciudades;
    private Scanner read;

    public CodigoPostalService() {
        this.ciudades = new HashMap();
        this.read = new Scanner(System.in).useDelimiter("\n");
    }
    
    private CodigoPostal crearCodigoPostal(){
        System.out.print("Ingrese codigo postal: ");
        String codigo = read.next();
        System.out.print("Ingrese nombre de la ciudad: ");
        String nombreCiudad = read.next();
        System.out.print("Ingrese nombre del pais: ");
        String nombrePais = read.next();
        return new CodigoPostal(codigo, nombreCiudad, nombrePais);
    }
    
    private void agregarAlMapa(CodigoPostal copo){
        String codigo = copo.getCodigoPostal();
        this.ciudades.put(codigo, copo);
    }
    
    public void agregarCodigoPostal(){
        agregarAlMapa(crearCodigoPostal());
    }
    
    public void mostrarCodigoPostal(){
        
        this.ciudades.entrySet().forEach((entry) -> {
            System.out.println(entry.getValue());
        });
        
    }
    
    public void buscarCodigoPostal(String codigoPostal){
        
        if(this.ciudades.containsKey(codigoPostal)){
            System.out.println(this.ciudades.get(codigoPostal).toString());
        } else{
            System.out.println("--- No existe dicho codigo postal ---");
        }
        
    }
    
    public void eliminarPorCodigoPostal(String codigoPostal){
        if(this.ciudades.containsKey(codigoPostal)){
            System.out.println("Eliminando " + this.ciudades.get(codigoPostal));
            this.ciudades.remove(codigoPostal);
            System.out.println("--- Se eliminó ---\n");
        } else{
            System.out.println("--- No se encontró el código postal ---");
        }
    }
    
}
