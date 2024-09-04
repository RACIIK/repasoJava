package org.renzocode.SOLID.OpenClose.Calculadora;

public class Calculadora {
    public static void main(String[] args) {

        Operaciones operacion = new Operaciones();

        operacion.establecerOperacion(new Suma());
        System.out.println("La suma de " + operacion.calcular(10, 2));

        operacion.establecerOperacion(new Resta());
        System.out.println("La suma de " + operacion.calcular(10, 2));

        operacion.establecerOperacion(new Dividir());
        System.out.println("La suma de " + operacion.calcular(3, 2));
    }
}
