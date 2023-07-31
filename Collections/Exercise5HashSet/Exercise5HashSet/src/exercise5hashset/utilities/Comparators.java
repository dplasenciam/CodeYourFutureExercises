/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5hashset.utilities;

import exercise5hashset.entities.PaisHashSet;
import java.util.Comparator;

/**
 *
 * @author Daniel Plasencia
 */
public class Comparators {
    
    
    public static Comparator<PaisHashSet> ordenarPorNombreAsc = new Comparator<PaisHashSet> (){
        @Override
        public int compare(PaisHashSet t1, PaisHashSet t2) {
            return t1.getNombre().compareTo(t2.getNombre());
        }
        
    };
    
}
