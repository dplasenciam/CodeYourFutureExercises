/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5hashset.services;
import exercise5hashset.entities.PaisHashSet;
import exercise5hashset.utilities.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Daniel Plasencia
 */
public class PaisServiceHashSet {
    
    private Set<PaisHashSet> paises;
    private Scanner read;

    public PaisServiceHashSet() {
        this.paises = new HashSet();
        this.read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    }
    
    private PaisHashSet crearPais(){
        System.out.println("Ingrese el nombre del país");
        String nombrePais = read.next();
        return new PaisHashSet(nombrePais);
    }
    
    private void agregarPais(PaisHashSet p){
        this.paises.add(p);
    }
    
    public void ingresarPais(){
        agregarPais(crearPais());
    }
    
    public void eliminarPaisPorNombre(String nombrePais){
        Iterator<PaisHashSet> it = paises.iterator();
        int contador = 0;
        PaisHashSet aux;
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
    
    public void mostrarPaisesOrdenados(){
        
        ArrayList<PaisHashSet> paisesOrdenados = new ArrayList(this.paises);
        Collections.sort(paisesOrdenados, Comparators.ordenarPorNombreAsc);
        
        for (PaisHashSet paisOrdenado : paisesOrdenados) {
            System.out.println(paisOrdenado);
        }
        
    }
    
    
    
}
