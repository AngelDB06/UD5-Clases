package Arrays.ej3;

public class PruebaArticulo {
    private Articulo[] articulos;

    public PruebaArticulo (int narticulos){
        articulos=new Articulo[narticulos];
    }

    void almacena(Articulo a1){
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i]==null) {
                articulos[i]=a1;
                System.out.println("True");
            }
        }
        
    }
}
