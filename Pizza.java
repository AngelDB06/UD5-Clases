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
        estado="Servida";
        servidas=servidas+1;
    }
    
    
    static int getTotalPedidas(){
        return pedidas;
    }

    static int getTotalServidas(){
        return servidas;
    }
    public static void main(String[] args) {
        Pizza p1= new Pizza("margarita", "mediana");
        Pizza p2= new Pizza("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        System.out.println("pizza"+p1.getTipo()+", "+p1.getTamaño()+", "+p1.getEstado());
        System.out.println("pizza"+p2.getTipo()+", "+p2.getTamaño()+", "+p2.getEstado());
        System.out.println("pizza"+p3.getTipo()+", "+p3.getTamaño()+", "+p3.getEstado());
        p2.sirve();
        System.out.println("pedidas: "+Pizza.getTotalPedidas());
        System.out.println("servidas: "+Pizza.getTotalServidas());
    }
}
