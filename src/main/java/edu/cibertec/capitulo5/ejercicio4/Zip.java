package edu.cibertec.capitulo5.ejercicio4;

public class Zip extends Documento implements Comprimible {

    @Override
    public void comprimir() {
        System.out.println("Comprimo el archivo en Zip");
    }

    @Override
    public void descomprimir() {
        System.out.println("Descomprimo archivo desde Zip");
    }
   
}
