package ej3;

public class Animal {
    String nombre;
    int edad, peso;

    String obtenernombre () {
        return nombre;
    }

    int obteneredad () {
        return edad;
    }

    int obtenerpeso () {
        return peso;
    }

    void establecernombre (String vnombre) {
        nombre=vnombre;
    }

    void estableceredad (int vedad) {
        edad=vedad;
    }

    void establecerpeso (int vpeso) {
        peso=vpeso;
    }
    public static void main(String[] args) {
        Animal animal1=new Animal();

        animal1.estableceredad(4);
        animal1.establecernombre("León");
        animal1.establecerpeso(90);

        System.out.println("El animal es un "+animal1.obtenernombre()+", su edad es de "+animal1.obteneredad()+" años y tiene un peso de "+animal1.obtenerpeso());
    }
}
