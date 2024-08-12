package org.renzocode.Proy02.CriaturasMarinas;

import org.renzocode.Proy02.Interfaces.IAlimentable;
import org.renzocode.Proy02.Interfaces.IComunicable;

public class Delfin extends CriaturasMarinas implements IComunicable,IAlimentable {

    public Delfin(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        System.out.println(nombre+ " esta nadando como delfin");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre+" emite sonidos y chasquidos para comunicarse");
    }

    @Override
    public void alimentar() {
        System.out.println("Estamos alimentando a "+ nombre);
    }
}
