package org.renzocode.Herencia;

public class Animal {

    String nombre;
    int edad;
    static int contandorAnimales = 0;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contandorAnimales++;
    }

    public String hacerSonido(){
        return "Hacer sonido generico";
    }

    public static int getContadorAnimales(){
        return contandorAnimales;
    }

}
