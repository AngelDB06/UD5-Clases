package Arrays;

public class Autobus {
    String matricula, modelo;
    float potenciaCV;
    int numeroPlazas;

    void setNumeroPlazas (int vNP) {
        numeroPlazas=vNP;
    }

    void setMatricula(String m){
        matricula=m;
    }
    
    void setModelo(String model){
        modelo=model;
    }

    void setpotenciaCV (float CV){
        potenciaCV=CV;
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
}
