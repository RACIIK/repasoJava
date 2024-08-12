package org.renzocode.Herencia;

public class Gato extends Animal {

    public Gato(String nombre, int edad){
        //Con la palabra super estamos asignando la información heredada
        super(nombre,edad);
    }

    @Override
    public String hacerSonido(){
        return "Miau";
    }
}
