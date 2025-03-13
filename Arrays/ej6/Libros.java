package Arrays.ej6;

public class Libros {
    private int codigo;
    private static int librostotal;
    private String titulo, autor;

    public Libros (int codigo, String titulo, String autor){
        this.codigo=codigo;
        this.titulo=titulo;
        this.autor=autor;

        librostotal += 1;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public static void getLibrosTotal(){
        System.out.println("El número total de libros es: "+librostotal);
    }

    @Override
    public String toString(){
        return "Codigo: "+codigo+" Titulo: "+titulo+" Autor: "+autor;
    }


}
