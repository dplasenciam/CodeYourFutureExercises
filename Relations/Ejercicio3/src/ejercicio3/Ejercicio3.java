/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Daniel Plasencia
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Baraja b = new Baraja();
        b.mostrarBaraja();
        System.out.println("### BARAJEANDO ###");
        b.barajear();
        b.mostrarBaraja();
        
        System.out.println("Cual es la carta actual?");
        System.out.println(b.siguienteCarta().toString());
        System.out.println("Cuantas cartas hay?");
        System.out.println(b.cartasDisponible());
        
        b.darCartas();
        System.out.println("Cuantas cartas hay?");
        System.out.println(b.cartasDisponible());
        
        System.out.println("### MAZO CON CARTAS ACTUALES");
        b.mostrarBaraja();
        System.out.println("### MAZO DE CARTAS QUE RETIRÉ");
        b.cartasMonton();
        
    }
    
}
