package ej3;

public class Gato {
    String nombre, color;
    int edad;

    String obtenernombre () {
        return nombre;
    }

    String obtenercolor () {
        return color;
    }

    int obteneredad () {
        return edad;
    }

    void establecernobmre (String vnombre) {
        nombre=vnombre;
    }

    void establecercolor (String vcolor) {
        color=vcolor;
    }

    void estableceredad (int vedad) {
        edad=vedad;
    }

    public static void main(String[] args) {
        Gato gato1=new Gato();

        gato1.establecernobmre("Wilson");
        gato1.establecercolor("Naranja");
        gato1.estableceredad(5);

        System.out.println("El nombre del gato es "+gato1.obtenernombre()+", es de color "+gato1.obtenercolor()+" y tiene "+gato1.obteneredad()+" años.");
    }
}
