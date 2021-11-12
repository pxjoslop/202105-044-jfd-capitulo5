package edu.cibertec.capitulo5.ejercicio2;

public class Persona {
    int codigo;
    String nombre;
    int edad;

    public Persona(int codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }
    
    void comer() {
        System.out.println(nombre+ " está comiendo desde los "+
                edad + " años");
    }
    
    void beber() {
        
    }
}
