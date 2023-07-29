/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> lista = new ArrayList();
        int numero;
        
        while(true){
            System.out.print("Ingrese número: ");
            numero = read.nextInt();
            if(numero == -99){
                System.out.println("--- Se ingresó -99. Se termina el bucle ---");
                break;
            } else{
                lista.add(numero);
            }
        }
        
        System.out.println("--- Datos ---");
        
        if(lista.isEmpty()){
            System.out.println("La lista está vacía"); 
        } else{
            int tamanio = lista.size();
            System.out.println("Se han ingresado "+tamanio);
            int suma=0;
            for (Integer num : lista) {
                suma = suma+num;
            }
            System.out.println("La suma de todos los elementos es " + suma);
            Double media = (suma*1.0)/tamanio;
            System.out.println("La media es " + media);
        }
        
    }
    
}
