/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2.services;

import exercise2.entities.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class PerroService {
    
    private List<Perro> perros;
    private Scanner read;

    public PerroService() {
        this.read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        this.perros = new ArrayList();
    }
    
    private Perro crearPerro(){
        
        System.out.println("Ingrese la raza del perro");
        String raza = read.next();
        return new Perro(raza);
        
    }
    
    private void agregarPerro(Perro p){
        this.perros.add(p);
    }
    
    public void crearAgregarPerro(){
        agregarPerro(crearPerro());
    }
    
    public void mostrarPerros(){
        this.perros.forEach((e)->System.out.println(e));
    }
    
    public void eliminarRazaPorNombre(String nombre){
        Iterator<Perro> it = this.perros.iterator();
        int contador = 0;
        while(it.hasNext()){
            if (it.next().getRaza().equals(nombre)){
                it.remove();
                contador++;
            }
        }
        if (contador == 0){
            System.out.println("-- No se encontró ninguna coincidencia --");
        }
        
    }
    
    public void ordenarLista(){
        Collections.sort(this.perros);
    }
    
}
