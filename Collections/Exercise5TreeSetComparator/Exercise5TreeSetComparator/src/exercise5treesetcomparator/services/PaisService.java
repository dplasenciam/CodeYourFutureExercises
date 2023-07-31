/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5treesetcomparator.services;

import exercise5treesetcomparator.entities.Pais;
import exercise5treesetcomparator.utilities.Comparators;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Daniel Plasencia
 */
public class PaisService {
    
    private Set<Pais> paises;
    private Scanner read;

    public PaisService() {
        this.paises = new TreeSet(Comparators.ordenarPorNombreAsc);
        this.read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    }
    
    private Pais crearPais(){
        System.out.println("Ingrese el nombre del país");
        String nombrePais = read.next();
        return new Pais(nombrePais);
    }
    
    private void agregarPais(Pais p){
        this.paises.add(p);
    }
    
    public void ingresarPais(){
        agregarPais(crearPais());
    }
    
    public void eliminarPaisPorNombre(String nombrePais){
        Iterator<Pais> it = paises.iterator();
        int contador = 0;
        Pais aux;
        while(it.hasNext()){
            aux = it.next();
            if(aux.getNombre().equals(nombrePais)){
                it.remove();
                System.out.println("Se removió el país " + aux.getNombre());
                contador++;
            }
        }
        if(contador==0){
           System.out.println("!!! No se encontró el país !!!"); 
        }
    }
    
    public void mostrarPaises(){
        this.paises.forEach((e)->System.out.println(e));
    }
    
    
    
}
