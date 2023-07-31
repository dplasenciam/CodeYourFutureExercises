/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5hashset.entities;

import java.util.Objects;

/**
 *
 * @author Daniel Plasencia
 */
public class PaisHashSet {

    private String nombre;

    public PaisHashSet(String nombre) {
        this.nombre = nombre;
    }

    public PaisHashSet() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaisHashSet other = (PaisHashSet) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }



}
