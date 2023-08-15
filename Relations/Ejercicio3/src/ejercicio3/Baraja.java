/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Baraja {
    
    private List<Carta> cartasActuales;
    private List<Carta> cartasSalidas;
    private Scanner read;

    public Baraja() {
        cartasActuales = new ArrayList();
        cartasSalidas = new ArrayList();
        read = new Scanner(System.in).useDelimiter("\n");
        llenarCartas();
    }
    
    
    
    private void llenarCartas(){
        int numero;
        int palo;

        for (int i = 0; i < 40; i++) {
            
            while(true){
                
                numero = (int)(Math.random()*12+1);
                
                if(numero!=8 && numero!=9){
                    
                    palo = (int)(Math.random()*4+1);
                    
                    switch(palo){
                        case 1:
                            cartasActuales.add(new Carta(numero, "espadas"));
                            break;
                        case 2:
                            cartasActuales.add(new Carta(numero, "bastos"));
                            break;
                        case 3:
                            cartasActuales.add(new Carta(numero, "oros"));
                            break;
                        case 4:
                            cartasActuales.add(new Carta(numero, "copas"));
                            break;
                    }
                    
                    break;
                }
            }
            
        }
    }
    
    public void barajear(){
        Collections.shuffle(cartasActuales);
    }
    
    public Carta siguienteCarta(){
        if(cartasActuales.isEmpty()){
            System.out.println("No hay más cartas");
            return null;
        }else{
            return cartasActuales.get(0);
        }
    }
    
    public int cartasDisponible(){
        return cartasActuales.size();
    }
    
    public void darCartas(){
        System.out.print("Ingrese el numero de cartas que quiere: ");
        int nc = read.nextInt();
        int cd = cartasDisponible();
        int contador=1;
        
        if(nc>cd){
            System.out.println("No se puede devolver "+nc+" cartas porque solo hay "+cd+" disponibles");
        }else{
            Iterator<Carta> it = cartasActuales.iterator();
            while(it.hasNext()){
                if(contador>nc){
                    break;
                }
                Carta aux = it.next();
                cartasSalidas.add(aux);
                it.remove();
                contador++;
            }
        }
    }
    
    public void cartasMonton(){
        int contador = 1;
        if(cartasSalidas.isEmpty()){
            System.out.println("No hay cartas que hayan salido");
        }else{
            for (Carta cs : cartasSalidas) {
                System.out.println(cs);
                contador++;
            }
        } 
    }
 
    public void mostrarBaraja(){
        int contador = 1;
        if(cartasActuales.isEmpty()){
            System.out.println("No hay cartas en la baraja");
        }else{
            for (Carta ca : cartasActuales) {
                System.out.println(contador+ " "+ ca);
                contador++;
            }
        } 
    }
    
}
   
