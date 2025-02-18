package Arrays.ej3;

public class Articulo {
    private int codarticulo,stock;
    private float precioCompra, precioVenta;
    private String descripcion;

    public Articulo(int codarticulo, String descripcion){
        this.codarticulo=codarticulo;
        this.descripcion=descripcion;
    }

    void setStock(int stock){
        this.stock=stock;
    }

    void setPrecioCompra(float precioCompra){
        this.precioCompra=precioCompra;
    }

    void setPrecioVenta(float precioVenta){
        this.precioVenta=precioVenta;
    }

    int getStock(){
        return stock;
    }

    int getCodArticulo(){
        return codarticulo;
    }

    String getDescripcion(){
        return descripcion;
    }

    float getPrecioVenta(){
        return precioVenta;
    }

    float getPrecioCompra(){
        return precioCompra;
    }
}
