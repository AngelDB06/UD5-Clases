package Arrays.ej5;

public class Autores {
    private String nombre, nacionalidad;
    private static int autorestotal;

    public Autores(String nombre, String nacionalidad){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;

        autorestotal += 1;
    }

    public String getNombre(){
        return nombre;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }

    public static void getAutoresTotal(){
        System.out.println("El número total de autores es: "+autorestotal);
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+" Nacionalidad: "+nacionalidad;
    }
}
