public class Pizza {
    String tipo, tamaño, estado;
    static int pedidas, servidas;

    Pizza (String vtipo, String vtamaño){
        tipo=vtipo;
        tamaño=vtamaño;
        estado="Pedida";
        pedidas=pedidas+1;
    }

    String getTipo(){
        return tipo;
    }

    String getTamaño(){
        return tamaño;
    }

    String getEstado(){
        return estado;
    }

    void sirve(){
        if (estado=="Servida") {
            System.out.println("esa pizza ya se ha servido");
        } else {
            estado="Servida";
            servidas=servidas+1;
        }
    }
    
    
    static int getTotalPedidas(){
        return pedidas;
    }

    static int getTotalServidas(){
        return servidas;
    }

    @Override
    public String toString(){
        return "pizza "+tipo+", "+tamaño+", "+estado;
    }

    public static void main(String[] args) {
        Pizza p1= new Pizza("margarita", "mediana");
        Pizza p2= new Pizza("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: "+Pizza.getTotalPedidas());
        System.out.println("servidas: "+Pizza.getTotalServidas());
    }
}
