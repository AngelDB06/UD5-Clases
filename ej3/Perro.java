package ej3;

public class Perro {
    String nombre, color;
    int edad;

    String getnombre () {
        return nombre;
    }

    String getcolor () {
        return color;
    }

    int getedad () {
        return edad;
    }

    void setnombre (String vnombre) {
        nombre=vnombre;
    }

    void setcolor (String vcolor) {
        color=vcolor;
    }

    void setedad (int vedad) {
        edad=vedad;
    }

    public static void main(String[] args) {
        Perro perro1=new Perro();

        perro1.setnombre("Firulais");
        perro1.setcolor("Negro");
        perro1.setedad(6);

        System.out.println("El perro se llama "+perro1.getnombre()+" es de color "+perro1.getcolor()+" y tiene "+perro1.getedad()+" años.");
    }
}
