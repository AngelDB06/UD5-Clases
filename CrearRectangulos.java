public class CrearRectangulos {
    public static void main(String[] args) {
        // Crear tres objetos de clase Rectangulo
        Rectangulo r1= new Rectangulo();
        Rectangulo r2= new Rectangulo();
        Rectangulo r3= new Rectangulo();

        System.out.println("Nombre de la clase del objeto es: "+r1.getNombreFigura());       
        System.out.println("Nombre de la clase del objeto es: "+r2.getNombreFigura());       
        System.out.println("Nombre de la clase del objeto es: "+r3.getNombreFigura());

        System.out.println("Valor de PI en r1"+r1.getPI());
        System.out.println("Valor de PI en r2"+r2.getPI());
        System.out.println("Valor de PI en r3"+r3.getPI());

    }
}
