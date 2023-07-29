/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4.entities;

/**
 *
 * @author Daniel Plasencia
 */
public class CodigoPostal {
    
    private String codigoPostal;
    private String ciudad;
    private String pais;

    public CodigoPostal() {
    }

    public CodigoPostal(String codigoPostal, String ciudad, String pais) {
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ciudad => " + "codigoPostal=" + codigoPostal + ", Ciudad=" + ciudad + ", Pais=" + pais;
    }
    
    
    
}
