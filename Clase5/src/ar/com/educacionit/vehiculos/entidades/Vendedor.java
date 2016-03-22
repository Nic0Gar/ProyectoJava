
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Persona;

public class Vendedor extends Persona {
    
    int cantAutosVendidos;

    
    public Vendedor(int cantAutosVendidos, String nombre, String apellido, String numeroDocumento) {
        super(nombre, apellido, numeroDocumento);
        this.cantAutosVendidos = cantAutosVendidos;
    }

    @Override
    public String toString() {
        return super.toString()+"Vendedor{" + "cantAutosVendidos=" + cantAutosVendidos + '}';
    }
    
    
    
}
