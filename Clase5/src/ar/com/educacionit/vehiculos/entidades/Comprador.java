
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Persona;


public class Comprador extends Persona {
    
    double presupuesto;

    public Comprador(double presupuesto, String nombre, String apellido, String numeroDocumento) {
        super(nombre, apellido, numeroDocumento);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()+"Comprador{" + "presupuesto=" + presupuesto + '}';
    }
    
    
}
