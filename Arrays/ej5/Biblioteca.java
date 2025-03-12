package Arrays.ej5;

public class Biblioteca {
    public static void main(String[] args) {
        Autores[] autores = {new Autores("Miguel De Cervantes", "Española"), new Autores("Stephen King", "Estadounidense") };
        Libros[] libros = new Libros[5];
        libros[0] = new Libros(1085, "El Quijote", "Miguel De Cervantes");
        libros[1] = new Libros(1946, "Novelas Ejemplares", "Miguel De Cervantes");
        libros[2] = new Libros(2147, "La Galatea", "Miguel De Cervantes");
        libros[3] = new Libros(1497, "It", "Stephen King");
        libros[4] = new Libros(1523, "El resplandor", "Stephen King");

        System.out.println(libros[0]);
        System.out.println(libros[1]);
        System.out.println(libros[2]);
        System.out.println(libros[3]);
        System.out.println(libros[4]);
        System.out.println(autores[0]);
        System.out.println(autores[1]);
        Libros.getLibrosTotal();
        Autores.getAutoresTotal();
    }
}
