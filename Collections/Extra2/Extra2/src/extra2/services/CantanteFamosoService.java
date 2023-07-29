/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2.services;

import extra2.entities.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class CantanteFamosoService {
    
    private Scanner read;
    private List<CantanteFamoso> cantantes;

    public CantanteFamosoService() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.cantantes = new ArrayList();
    }
    
    private CantanteFamoso crearCantanteFamoso(){
        System.out.print("Ingrese el nombre del cantante: ");
        String nombreCantante = read.next();
        System.out.print("Ingrese el nombre del disco más vendido: ");
        String disco = read.next();
        return new CantanteFamoso(nombreCantante, disco);
    }
    
    private void agregarLista(CantanteFamoso cf){
        this.cantantes.add(cf);
    }
    
    public void agregarCantante(){
        agregarLista(crearCantanteFamoso());
    }
 
    public void mostrarCantantes(){
        cantantes.forEach((cantante) -> {
            System.out.println(cantante);
        });
    }
    
    public void eliminarCantantePorNombre(String nombre){
        Iterator<CantanteFamoso> it = cantantes.iterator();
        int contador = 0;
        while(it.hasNext()){
            if(it.next().getNombre().equals(nombre)){
                it.remove();
                contador++;
            }
        }
        if(contador == 0){
            System.out.println("--- No se encontró el cantante ---");
        }
    }
    
}
