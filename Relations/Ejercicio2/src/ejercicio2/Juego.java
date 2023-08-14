/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Juego {
    
    private List<Jugador> jugadores;
    private RevolverDeAgua revolver;
    private Scanner read;
    private int contador;
    
    public Juego() {
    
        this.jugadores = new ArrayList();
        this.revolver = new RevolverDeAgua();
        this.read = new Scanner(System.in).useDelimiter("\n");
        contador = 1;
    }
    
    
    
    public Jugador crearJugador(){
        System.out.println("### Creando jugador ###");
        int cont = this.contador;
        this.contador++;
        return new Jugador(cont);
    }
    
    private void agregarJugador(Jugador j){
        this.jugadores.add(j);
    }
    
    private void crearJugadores(){
        System.out.println("Cuántos jugadores habrá?");
        int cantidad = read.nextInt();
        if(cantidad<=0){
            System.out.println("Se ingresó un número menor o igual a 0. Se considerará 1 jugador");
            cantidad = 1;
        }else if(cantidad>6){
            System.out.println("Se ingresó una cantidad mayor a 6. Se considerará solo 6");
            cantidad = 6;
        }
        
        for (int i = 0; i < cantidad; i++) {
            agregarJugador(crearJugador());
        }
    }
    
    public void mostrarJugadores(){
        for (Jugador j : jugadores) {
            System.out.println(j);
        }
    }
    
    public void ronda(){
        crearJugadores();
        System.out.println("\n### INICIANDO JUEGO ####");
        boolean sigue=true;
        while(sigue){
            for (Jugador j : jugadores) {
                System.out.println("Turno del jugador"+j.getId());
                revolver.toString();
                if(j.disparo(revolver)){
                    System.out.println("El jugador #"+j.getId()+" se ha disparado");
                    System.out.println("Posicion del agua: "+revolver.getPosicionAgua()+"/10");
                    System.out.println("Se terminó el juego!");
                    sigue=false;
                    break;
                }
            }
        }
        

    }
    
}
