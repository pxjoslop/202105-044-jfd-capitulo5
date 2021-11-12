package edu.cibertec.capitulo5.ejercicio2;

public class Empleado extends Persona {

    int tipoContrato;
    double sueldo;

    @Override
    void comer() {
        super.comer();
        System.out.println(nombre+ " come más rápido porque tiene un horario ");
    }
    
    void calcularSueldo() {}
}
