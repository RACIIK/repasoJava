package org.renzocode.Abstracta;

public abstract class Figura {

    //Este comportamiento sera obligatoria que hereden de Figura
    abstract double calcularArea();

    void imprimirInformacion(){
        System.out.println("Esta información es de la clase abstracta ");
    }

}
