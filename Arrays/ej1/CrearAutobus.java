package Arrays.ej1;
import java.util.Scanner;

public class CrearAutobus {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Autobus[] autobus = new Autobus[4];

        for (int i=0; i<autobus.length;i++){
            String m="", model="";
            float CV=0;
            int NP=0;

            System.out.println("Introduce la matrícula:");
            m= scanner.nextLine();
            System.out.println("Introduce el modelo:");
            model= scanner.nextLine();
            System.out.println("Introduce los caballos:");
            CV= scanner.nextFloat();
            System.out.println("Introduce el número de plazas:");
            NP= scanner.nextInt();

            autobus[i]= new Autobus(m, model, CV, NP);
            autobus[i].display();
        }
        scanner.close();
    }
}
