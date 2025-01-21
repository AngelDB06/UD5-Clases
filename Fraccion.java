public class Fraccion {
    //Atributos de objeto
    int numerador, denominador;

    //Métodos de objeto
    void invierte () {
        int temp;
        temp=numerador;
        numerador=denominador;
        denominador=temp;
    }

    void setFraccion(int n, int d){
        numerador=n;
        denominador=d;
    }

    int getNumerador(){
        return numerador;
    }

    int getDenominador(){
        return denominador;
    }

    static Fraccion Multiplicar(Fraccion f1, Fraccion f2){
        Fraccion f3=new Fraccion();

        f3.setFraccion(f1.getNumerador()*f2.getNumerador(), f1.getDenominador()*f2.getDenominador());

        return (f3);
    }

    static Fraccion Dividir(Fraccion f1, Fraccion f2){
        Fraccion f3=new Fraccion();

        f3.setFraccion(f1.getNumerador()*f2.getDenominador(), f1.getDenominador()*f2.getNumerador());

        return (f3);
    }

    static Fraccion Simplificar(Fraccion f1){
        int divisor=Math.min(f1.getDenominador(), f1.getNumerador()),numerador=Math.max(f1.getDenominador(), f1.getNumerador());
        int divisorog,numeradorog;
        divisorog=divisor;
        numeradorog=numerador;
        Fraccion f4=new Fraccion();

       while (numerador%divisor!=0) {
            if (numerador%divisor!=0) {
                int temp=numerador;
                numerador=divisor;
                divisor=temp%divisor;
            }
        }
        f4.setFraccion(numeradorog/divisor, divisorog/divisor);
        return f4;
    }
    public static void main(String[] args) {
        Fraccion f1=new Fraccion();
        Fraccion f2=new Fraccion();
        Fraccion f3=new Fraccion();

        
        f1.setFraccion(10, 5);
        f2.setFraccion(3, 6);
        
        f3= Fraccion.Multiplicar(f1, f2);
        
        System.out.println("El resultado de la multiplicación es "+f3.getNumerador()+"/"+f3.getDenominador());

        f3 = Fraccion.Dividir(f1,f2);

        System.out.println("El resultado de la division es "+f3.getNumerador()+"/"+f3.getDenominador());

        f3= Fraccion.Simplificar(f1);
        
        System.out.println("Numerador: "+f3.getNumerador()+", Denominador: "+f3.getDenominador());
        
    }
}
