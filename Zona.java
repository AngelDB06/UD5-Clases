import java.util.Scanner;

public class Zona {
    private int entradasPorVender;
    

    public Zona(int n){
        entradasPorVender = n;
    }

    public int getEntradasPorVender() {
        return entradasPorVender;
    }
    
    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.println("Sólo me quedan "+ this.entradasPorVender+" entradas para esa zona.");
        }

        if (this.entradasPorVender>=n) {
            entradasPorVender -= n;
            System.out.println("Aquí tienes sus "+ n +" entradas, gracias.");
        }
    }

    void menu(){
        Scanner scanner= new Scanner(System.in);
        int n=0;
        
        while (n!=3) {
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            n=scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println(getEntradasPorVender());
                break;
                case 2:
                    System.out.println("Cuántas entradas quieres comprar?");
                    int ne=scanner.nextInt();
                    vender(ne);
                    break;
                
            } 
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       Zona principal=new Zona(1000);
       Zona compra_venta=new Zona(200);
       Zona vip=new Zona(25);

       int n=0;
       
       while (n!=4) {
        System.out.println("1. Zona Principal");
        System.out.println("2. Zona de Compra-Venta");
        System.out.println("3. Zona VIP");
        System.out.println("4. Salir");
        n=scanner.nextInt();
        switch (n) {
            case 1:
                principal.menu();
            break;
            case 2:
                compra_venta.menu();
                break;
            case 3:
                vip.menu();
                break;
        } 
    }
    }
}
