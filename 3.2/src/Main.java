import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /* Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo.
        SE introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
        la media, el número de alumnos y cuántos son mayores de edad. (pag 74)*/




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
