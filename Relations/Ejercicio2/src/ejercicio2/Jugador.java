/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Daniel Plasencia
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.nombre = "Jugador"+id;
        this.mojado = false;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
    
    public boolean disparo(RevolverDeAgua r){
        
        boolean moja = r.mojar();
        r.siguienteChorro();
        
        if (moja){
            this.mojado = true;
            return true;
        }else{
            return false;
        }
        
    }
    
    
}
