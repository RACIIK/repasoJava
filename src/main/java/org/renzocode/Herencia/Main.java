package org.renzocode.Herencia;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal ("Milufa" ,10);
        Gato gato = new Gato("Brownie",9);
        Perro perro = new Perro("Negra", 12);

        System.out.print("El animal llamado "+animal.nombre+" hace "+animal.hacerSonido());
        //System.out.println(animal.hacerSonido());
        System.out.println("El animal llamado "+gato.nombre+" hace ");
        System.out.println(gato.hacerSonido());
        System.out.println("El animal llamado "+perro.nombre+" hace ");
        System.out.println(perro.hacerSonido());

        System.out.println("Total de animales creados:  "
                +Animal.getContadorAnimales());


    }


}