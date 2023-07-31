/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5treesetcomparator.utilities;

import exercise5treesetcomparator.entities.Pais;
import java.util.Comparator;

/**
 *
 * @author Daniel Plasencia
 */
public class Comparators {
    
    public static Comparator<Pais> ordenarPorNombreAsc = new Comparator<Pais>(){
        @Override
        public int compare(Pais t1, Pais t2) {
            return t1.getNombre().compareTo(t2.getNombre());
        }
        
    };
    
}
