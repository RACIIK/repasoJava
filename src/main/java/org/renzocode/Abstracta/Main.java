package org.renzocode.Abstracta;


public class Main {
    public static void main(String[] args) {

    Circulo circulo = new Circulo(10);
    Rectangulo rectangulo = new Rectangulo( 10.4, 5.54);

    circulo.imprimirInformacion();
    System.out.println("El area del circulo es:"+circulo.calcularArea());
      rectangulo.imprimirInformacion();
    System.out.println("El area del rectangulo es "+rectangulo.calcularArea());

    }
}