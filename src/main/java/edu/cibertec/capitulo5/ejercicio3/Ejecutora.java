package edu.cibertec.capitulo5.ejercicio3;

public class Ejecutora {

    public static void main(String[] args) {
        
        Word miWord = new Word();
        miWord.contarLineas();
        miWord.contarPalabras();
        
        Excel miExcel = new Excel();
        miExcel.contarLineas();
        miExcel.contarPalabras();
        
        Zip miZip = new Zip();
        miZip.comprimir();
        miZip.descomprimir();
    }
    
}
