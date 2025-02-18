package Arrays.ej3;

public class Prueba {
    public static void main(String[] args) {
        PruebaArticulo prueba1=new PruebaArticulo(3);
        Articulo art1=new Articulo(32, "Lampara");
        Articulo art2=new Articulo(24, "Ratón");
        Articulo art3=new Articulo(15, "Bici eléctrica");

        prueba1.almacena(art1);
        prueba1.almacena(art2);
        prueba1.almacena(art3);
}
}