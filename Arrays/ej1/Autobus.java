package Arrays.ej1;

public class Autobus {
    String matricula, modelo;
    float potenciaCV;
    int numeroPlazas;

    Autobus (String m, String model, float CV, int NP){
        matricula=m;
        modelo=model;
        potenciaCV=CV;
        numeroPlazas=NP;
    }

    String getmatricula () {
        return matricula;
    }

    String getmodelo () {
        return modelo;
    }

    float getpotenciaCV () {
        return potenciaCV;
    }

    int getNumeroPlazas () {
        return numeroPlazas;
    }

    public void display(){
        System.out.println("La matricula es: "+this.matricula+" El modelo es: "+this.modelo+" La potencia de CV es: "+this.potenciaCV+" El número de plazas es: "+this.numeroPlazas);
    }
}
