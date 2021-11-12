package edu.cibertec.capitulo5.ejercicio5;

public class Excel extends Documento implements Contable, Imprimible {
    
    private boolean soyExtensionXlsx;
    private double versionExcel;
    
    @Override
    public int contarPalabras() {
        System.out.println("Cuento palabras como un MS Excel");
        return 0;
    }

    @Override
    public int contarLineas() {
        System.out.println("Cuento lineas como un MS Excel");
        return 0;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimo como un MS Excel");
    }

    public boolean isSoyExtensionXlsx() {
        return soyExtensionXlsx;
    }

    public void setSoyExtensionXlsx(boolean soyExtensionXlsx) {
        this.soyExtensionXlsx = soyExtensionXlsx;
    }

    public double getVersionExcel() {
        return versionExcel;
    }

    public void setVersionExcel(double versionExcel) {
        this.versionExcel = versionExcel;
    }
}
