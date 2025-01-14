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
    public static void main(String[] args) {
        Fraccion f1=new Fraccion();
        Fraccion f2=new Fraccion();
        Fraccion f3=new Fraccion();

        f1.setFraccion(2, 4);
        f2.setFraccion(3, 6);
        f3= Fraccion.Multiplicar(f1, f2);
        
        System.out.println("El resultado de la multiplicación es "+f3.getNumerador()+"/"+f3.getDenominador());

        f3 = Fraccion.Dividir(f1,f2);

        System.out.println("El resultado de la division es "+f3.getNumerador()+"/"+f3.getDenominador());

        
    }
}
