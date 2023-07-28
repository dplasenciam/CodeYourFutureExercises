/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.services;

import exercise1.entitites.Perro;
import java.util.ArrayList;
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
        this.read = new Scanner(System.in).useDelimiter("\n");
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
    
}
