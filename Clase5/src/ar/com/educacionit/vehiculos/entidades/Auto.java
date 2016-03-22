
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Vehiculo;


public class Auto extends Vehiculo {
    
    String marca, modelo, color;

    public Auto(String marca, String modelo, String color, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+"Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    
    
}
