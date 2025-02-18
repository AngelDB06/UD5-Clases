package Arrays.ej3;

public class PruebaArticulo {
    private Articulo[] articulos;

    public PruebaArticulo (int narticulos){
        articulos=new Articulo[narticulos];
    }

    void almacena(Articulo a1){
        for (int indice = 0; indice < articulos.length; indice++) {
            if (articulos[indice]==null) {
                articulos[indice]=a1;
                System.out.println("True");
            }
        }
        
    }

    @Override
public String toString() {
    String resultado = "Artículos almacenados:\n";
    for (int i = 0; i < articulos.length; i++) {
        resultado += articulos[i].getCodArticulo()+" "+articulos[i].getDescripcion()+"\n";
    }
    return resultado;
}

}

