public class Autobus {
    String matricula, modelo;
    float potenciaCV;
    int numeroPlazas;

    void setNumeroPlazas (int vNP) {
        numeroPlazas=vNP;
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
