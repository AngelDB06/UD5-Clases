package Arrays.ej2;

public class Articulo {
    private int stock;
    private float pcompra, pventa;
    private String descripcion, codigo;

    Articulo (String cod, String desc){
        codigo=cod;
        descripcion=desc;
    }

    String getCodigo(){
        return codigo;
    }
    
    int getStock(){
        return stock;
    }

    float getpcompra(){
        return pcompra;
    }
    
    float getpventa(){
        return pventa;
    }

    String getdescripcion(){
        return descripcion;
    }

    void setPcompra(float pc){
        pcompra=pc;
    }

    void setPventa(float pv){
        pventa=pv;
    }

    void setStock(int s){
        stock=s;
    }
}
