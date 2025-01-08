public class Vivienda {
    int habitaciones;
    int metrosCuadrados;
    String direccion;

    int obtenerhabitaciones () {
        return habitaciones;
    }

    int obtenermetrosCuadrados () {
        return metrosCuadrados;
    }

    String obtenerdireccion () {
        return direccion;
    }

    void establecerhabitaciones (int vh) {
        habitaciones=vh;
    }

    void establecermetrosCuadrados (int vm2) {
        metrosCuadrados=vm2;
    }

    void establecerdireccion (String vd) {
        direccion=vd;
    }

    public static void main(String[] args) {
        Vivienda vivienda1=new Vivienda();

        vivienda1.establecerdireccion("Calle Olmo, 40");
        vivienda1.establecerhabitaciones(5);
        vivienda1.establecermetrosCuadrados(100);

        System.out.println("Los datos de la casa son:");
        System.out.println(+vivienda1.obtenerhabitaciones()+" habitaciones, "+vivienda1.obtenermetrosCuadrados()+" metros cuadrados, y la direccción es "+vivienda1.obtenerdireccion()+".");
    }
}
