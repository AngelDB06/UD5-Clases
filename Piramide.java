public class Piramide {
    int altura;
    static int ptotal;

    Piramide (int a) {
        altura=a;
    }

    int getaltura() {
        return altura;
    }

    int getPiramidesCreadas(){
        return ptotal;
    }

    @Override
   public String toString() {
        String cadena="";

        for (int i=0; i<this.altura; i++) {
            for (int j=0; j<this.altura-i-1;j++){
                cadena += " ";
            }
            for (int j=0;j <2*i+1;j++){
                cadena += "*";
            }
            cadena += "\n";
        }
        return cadena;
    }
}
