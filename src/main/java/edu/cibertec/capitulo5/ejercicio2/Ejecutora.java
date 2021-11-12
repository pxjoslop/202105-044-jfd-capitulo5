package edu.cibertec.capitulo5.ejercicio2;

public class Ejecutora {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        // propiedades del padre
        emp1.codigo = 0;
        emp1.nombre = "Carlos";
        emp1.edad = 25;
        // propiedades propias
        emp1.sueldo = 1520.15;
        
        emp1.comer();
    }
    
}
