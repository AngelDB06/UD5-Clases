public class Bicicleta {
    String color="Negro";
    int velocidad=0, marcha=2;

    void Avanzar(int v){
        velocidad=v;
        System.out.println("La velocidad actual es de "+velocidad+" KM/H.");
    }

    void Cambiomarcha(int m){
        marcha=m;
        System.out.println("La marcha actual es "+marcha+".");
    }

    void Frenar(){
        System.out.println("La bicicleta ha frenado.");
    }

    public static void main(String[] args) {
        Bicicleta b1=new Bicicleta();

        b1.Avanzar(20);
        b1.Cambiomarcha(5);
        b1.Frenar();
        System.out.println("El color de la bicicleta es "+b1.color+".");
    }
}