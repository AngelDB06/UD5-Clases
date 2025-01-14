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

    Fraccion Multiplicar(Fraccion fraccion1, Fraccion fraccion2){

        
        System.out.println("La fracción final es "+fraccion1+"/"+fraccion2);
        return fraccion1;
    }

    void Dividir(int n1, int d1, int n2, int d2){
        int nf, df;

        nf=n1*d2;
        df=d1*n2;

        System.out.println("La fracción final es "+nf+"/"+df);
    }
    public static void main(String[] args) {
        Fraccion fraccion1=new Fraccion();
        Fraccion fraccion2=new Fraccion();
        Fraccion f3=new Fraccion();

        fraccion1.setFraccion(2, 4);
        fraccion2.setFraccion(3, 6);
        f3.Multiplicar(fraccion1, fraccion2);

        
    }
}
