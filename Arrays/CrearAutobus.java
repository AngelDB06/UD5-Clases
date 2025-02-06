package Arrays;
import java.util.Scanner;

public class CrearAutobus {
    public static void main(String[] args) {
        Autobus[] autobus = new Autobus[4];

        for (int i=0; i<autobus.length;i++){
            Scanner scanner=new Scanner(System.in);

            System.out.println("Introduce el número de plazas del autobús "+i);
            autobus[i].setNumeroPlazas(scanner.nextInt());
            System.out.println("Introduce el número de matrícula del autobús "+i);
            autobus[i].setMatricula(scanner.nextLine());
            System.out.println("Introduce el modelo del autobús "+i);
            autobus[i].setModelo(scanner.nextLine());
            System.out.println("Introduce el número de caballos del autobús "+i);
            autobus[i].setpotenciaCV(scanner.nextFloat());
            
            
            scanner.close();
        }

        for (Autobus auxAutobus:autobus){
            System.out.println("Número de plazas: "+auxAutobus.getNumeroPlazas()+" Matrícula: "+auxAutobus.getmatricula()+" Modelo: "+auxAutobus.getmodelo()+" Caballos: "+auxAutobus.getpotenciaCV());
        }
    }
}
