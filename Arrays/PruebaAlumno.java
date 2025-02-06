package Arrays;

public class PruebaAlumno {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];
        alumnos[0] = new Alumno("Juan");
        alumnos[1] = new Alumno("Ana");
        alumnos[2] = new Alumno("Luis");

        for (int i=0; i<alumnos.length; i++) {
            System.out.println("Código: "+alumnos[i].getCodigo()+" Nombre: "+ alumnos[i].getNombre());
        }

        Alumno al1= new Alumno("Juan");
        Alumno al2;
        Alumno[] arrayAlumnos = new Alumno[10];
        Alumno[] arrayAlumnos2 = {new Alumno("pedro"), new Alumno("jorge")};

        arrayAlumnos[0]=al1;
        arrayAlumnos[1]=new Alumno("luis");

        for (Alumno auxAlumno:arrayAlumnos){
            if (auxAlumno!=null) {
                System.out.println("Nombre alumno "+ auxAlumno.getNombre());
            }
        }
    }
}
