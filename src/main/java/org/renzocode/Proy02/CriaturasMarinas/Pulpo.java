package org.renzocode.Proy02.CriaturasMarinas;

import org.renzocode.Proy02.Interfaces.IAlimentable;
import org.renzocode.Proy02.Interfaces.IComunicable;

public class Pulpo extends CriaturasMarinas implements IComunicable, IAlimentable {

    int cantTentaculos;

    public Pulpo(String nombre, int cantTentaculos) {
        super(nombre);
        this.cantTentaculos =cantTentaculos;
    }

    @Override
    public void nadar() {
        System.out.println(nombre +"Esta nadando con sus "
                +cantTentaculos +" tentaculos");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre+ "Saluda con sus "+cantTentaculos + " tentaculos.");
    }

    @Override
    public void alimentar() {
        System.out.println("Estamos alimentando con algas a "+nombre);
    }
}
