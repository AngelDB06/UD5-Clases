public class Tiempo {
    int horas=0, minutos=0, segundos=0;

    Tiempo (int h, int m, int s){
        horas=h;
        minutos=m;
        segundos=s;
    }

    int getHoras(){
        return horas;
    }

    int getMinutos(){
        return minutos;
    }

    int getSegundos(){
        return segundos;
    }

    void suma(Tiempo t1, Tiempo t2){
        this.segundos=t1.segundos+t2.segundos;
        if (this.segundos>=60) {
            do {
                int temp=this.segundos-60;
                this.minutos=this.minutos+1;
                this.segundos=temp;
            } while (this.segundos>=60);
        }
        this.minutos=t1.minutos+t2.minutos+this.minutos;
        if (this.minutos>=60) {
            do {
                this.minutos=this.minutos-60;
                this.horas=this.horas+1;
               
            } while (this.minutos>=60);
        }
        this.horas=t1.horas+t2.horas+this.horas;
    }

    void resta(Tiempo t1, Tiempo t2){
        this.segundos=t1.segundos-t2.segundos;
        this.minutos=0;
        if (this.segundos<0) {
            do {
                this.segundos=this.segundos+60;
                this.minutos=this.minutos+1;
            } while (this.segundos<0);
        }
        this.minutos=t1.minutos-t2.minutos-this.minutos;
        this.horas=0;
        if (this.minutos<0) {
            do {
                this.minutos=this.minutos+60;
                this.horas=this.horas+1;
            } while (this.minutos<0);
        }
        this.horas=t1.horas-t2.horas-this.horas;
    }
    

    @Override
    public String toString(){
        return horas+"h "+minutos+"m "+segundos+"s ";
    }
    public static void main(String[] args) {
        Tiempo t1=new Tiempo(3, 58, 1);
        Tiempo t2=new Tiempo(3, 1, 1);
        Tiempo t3=new Tiempo(0, 0, 0);

        System.out.println(t1);

        t3.suma(t1, t2);
        System.out.println(t3);

        t3.resta(t1, t2);
        System.out.println(t3);

        
    }
}
