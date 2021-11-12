package edu.cibertec.capitulo5.ejercicio5;

public class Ejecutora {

    public static void main(String[] args) {

        Documento arreglo[] = new Documento[5];
        arreglo[0] = new Word();
        arreglo[1] = new Zip();
        arreglo[2] = new Excel();
        arreglo[3] = new Word();
        arreglo[4] = new Excel();

        for (int i = 0; i < arreglo.length; i++) {
            Documento documento = arreglo[i];
            if (documento instanceof Imprimible) {
                Imprimible imprimible = (Imprimible) documento;
                imprimible.imprimir();
            } else {
                System.out.println("Este documento no se puede imprimir!");
            }
        }
    }

}
