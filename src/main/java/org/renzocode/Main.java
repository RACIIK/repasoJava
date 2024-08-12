package org.renzocode;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Renzo","Alvarez",
                23);

        persona1.setNombre("Ricado");
        persona1.setApellido("Arjona");
        persona1.setEdad(23);

        System.out.println(
                persona1.darNombreCompleto()+
                " tiene "+persona1.getEdad()+" años ");




    }


}