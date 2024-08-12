package org.renzocode.Herencia;

public class Perro extends Animal {

    public Perro(String nombre, int edad){
        //Con la palabra super estamos asignando la información heredada
        super(nombre,edad);
    }

    @Override
    public String hacerSonido(){
        return "Guau";
    }
}
