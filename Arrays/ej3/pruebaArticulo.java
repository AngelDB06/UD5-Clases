package Arrays.ej3;

import Arrays.ej2.Articulo;

public class pruebaArticulo {
    Articulo[] articulos;

    public pruebaArticulo (int tamano){
        articulos=new Articulo[tamano];
    }

    boolean almacena(Articulo a1){
        for(int i=0; i<articulos.length;i++){
            if (articulos[i]==null) {
                articulos[i]=a1;
                return true;
            }
        }
        return false;
    }
}
