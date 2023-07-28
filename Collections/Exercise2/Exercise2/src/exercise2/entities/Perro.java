/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2.entities;

/**
 *
 * @author Daniel Plasencia
 */
public class Perro implements Comparable<Perro> {

    private String raza;

    public Perro() {
    }

    
    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    @Override
    public int compareTo(Perro t) {
        return t.getRaza().compareTo(this.raza);
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }
    
    
    
}
