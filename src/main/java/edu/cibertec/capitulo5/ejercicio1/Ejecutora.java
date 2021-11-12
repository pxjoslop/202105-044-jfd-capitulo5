package edu.cibertec.capitulo5.ejercicio1;

public class Ejecutora {

    public static void main(String[] args) {
        
        Persona lista[] = new Persona[5];
        
        lista[0] = new Persona(1, "Juan", 20);
        lista[1] = new Persona(2, "Maria", 15);
        lista[2] = new Persona(3, "Yaddif", 34);
        lista[3] = new Persona(4, "Fernando", 68);
        lista[4] = new Persona(5, "Carla", 18);
        
        for (int i = 0; i < lista.length; i++) {
            lista[i].comer();
        }
    }
}
