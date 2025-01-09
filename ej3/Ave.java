package ej3;

public class Ave {
    String tave, color;
    int peso;

    String obtenertave () {
        return tave;
    }

    String obtenercolor () {
        return color;
    }

    int obtenerpeso () {
        return peso;
    }

    void establecertave (String vtave) {
        tave=vtave;
    }

    void establecercolor (String vcolor) {
        color=vcolor;
    }

    void establecerpeso (int vpeso) {
        peso=vpeso;
    }

    public static void main(String[] args) {
        Ave ave1=new Ave();
        
        ave1.establecertave("Paloma");
        ave1.establecercolor("Blanco");
        ave1.establecerpeso(380);

        System.out.println("El tipo de ave es una "+ave1.obtenertave()+" de color "+ave1.obtenercolor()+" y con un peso de "+ave1.obtenerpeso()+" gramos");
    }
}
