package org.renzocode;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    //Constructor
    public Persona (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public String darNombreCompleto(){

        return getNombre() +" "+getApellido();
    }
    public String enviarSaludo(String saludado){
        if (edad >= 25) return "Buenos días, querido" +saludado;
        return "Hola, ¿Cómo estas, "+ saludado + " ?";

    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
