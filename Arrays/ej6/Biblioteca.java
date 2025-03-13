package Arrays.ej6;

public class Biblioteca {
    public static void main(String[] args) {
        Autores[] autores = {new Autores("Miguel De Cervantes", "Española"), new Autores("Stephen King", "Estadounidense") };
        Libros[] libros = new Libros[5];
        libros[0] = new Libros(1085, "El Quijote", "Miguel De Cervantes");
        libros[1] = new Libros(1946, "Novelas Ejemplares", "Miguel De Cervantes");
        libros[2] = new Libros(2147, "La Galatea", "Miguel De Cervantes");
        libros[3] = new Libros(1497, "It", "Stephen King");
        libros[4] = new Libros(1523, "El resplandor", "Stephen King");
        Prestamos[] prestamos= new Prestamos[2];
        prestamos[0] = new Prestamos(1085, "13/03/2025", "01/04/2025", "Ángel Domínguez Barranco");
        prestamos[1] = new Prestamos(1487, "12/03/2025", "05/04/2025", "Pepe García Milena");

        System.out.println(libros[0]);
        System.out.println(libros[1]);
        System.out.println(libros[2]);
        System.out.println(libros[3]);
        System.out.println(libros[4]);
        System.out.println(autores[0]);
        System.out.println(autores[1]);
        Libros.getLibrosTotal();
        Autores.getAutoresTotal();
        System.out.println(prestamos[0]);
        System.out.println(prestamos[1]);
        Prestamos.getPrestotal();
    }
}
