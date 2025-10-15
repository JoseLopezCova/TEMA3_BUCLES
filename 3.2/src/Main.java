import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable
        int iEdad = 0;
        int iMayorEdad = 0;
        int iSumaEdades;
        int iNumAlumnos = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la edad del alumno: ");
            if (iEdad > 18) {
                iMayorEdad++;
            }
            iNumAlumnos++;
            iEdad = sc.nextInt();
        } while (iEdad > 0);
            iSumaEdades = iEdad + iEdad;


        System.out.println("Suma de edades: " + iSumaEdades);
        System.out.println("Media de edad: "+ (iSumaEdades/iNumAlumnos));
        System.out.println("Mayores de edad: " + iMayorEdad);
        System.out.println("Numero de alumnos: " + iNumAlumnos);
    }
}
