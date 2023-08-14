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
public class RevolverDeAgua {
    
    private int posicionActual;
    private int posicionAgua;

    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }
    
    public RevolverDeAgua(){
        llenarRevolver();
        toString();
    }
    
    public void llenarRevolver(){
        this.posicionActual = (int)(Math.random()*10+1);
        this.posicionAgua = (int)(Math.random()*10+1);
    }
    
    public boolean mojar(){
        return this.posicionActual == this.posicionAgua;
    }
    
    
    public void siguienteChorro(){
        if(this.posicionActual == 10){
            posicionActual = 1;
        } else{
            posicionActual += 1;
        }
    }

    @Override
    public String toString() {
        System.out.println("RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}');
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
}
