package ej3;

public class Mamifero {
    int longevidad;
    String alimentacion, tmamifero;
    
    String obtenertmamifero () {
        return tmamifero;
    }

    String obteneralimentacion () {
        return alimentacion;
    }

    int obtenerlongevidad () {
        return longevidad;
    }

    void establecertmamifero (String vtmamifero) {
        tmamifero=vtmamifero;
    }

    void estableceralimentacion (String valimentacion) {
        alimentacion=valimentacion;
    }

    void establecerlongevidad (int vlongevidad) {
        longevidad=vlongevidad;
    }
    public static void main(String[] args) {
        Mamifero mamifero1=new Mamifero();

        mamifero1.establecertmamifero("Perro");
        mamifero1.estableceralimentacion("Omnívoro");
        mamifero1.establecerlongevidad(10);

        System.out.println("El tipo de mamifero es un "+mamifero1.obtenertmamifero()+", están en el grupo de alimentación "+mamifero1.obteneralimentacion()+" y suelen tener una longevidad mínima de "+mamifero1.obtenerlongevidad()+" años.");
    }
}
