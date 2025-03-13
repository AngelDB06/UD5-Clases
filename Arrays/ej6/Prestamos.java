package Arrays.ej6;

public class Prestamos {
    private int codlibro;
    private static int prestotal=0;
    private String fechap, fechad, cliente;

    public Prestamos(int codlibro, String fechap, String fechad, String cliente){
        this.codlibro=codlibro;
        this.fechap=fechap;
        this.fechad=fechad;
        this.cliente=cliente;

        prestotal += 1;
    }

    @Override
    public String toString(){
        return "Código del libro: "+codlibro+" Fecha de préstamo: "+fechap+" Fecha de devolución: "+fechad+" Cliente: "+cliente;
    }

    public int getCodlibro(){
        return codlibro;
    }

    public static void getPrestotal(){
        System.out.println(prestotal);
    }

    public String getFechap(){
        return fechap;
    }

    public String getFechad(){
        return fechad;
    }

    public String getCliente(){
        return cliente;
    }
}
