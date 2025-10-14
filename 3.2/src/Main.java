import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /* Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo.
SE introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
la media, el número de alumnos y cuántos son mayores de edad. (pag 74)*/


        //Entrada
        System.out.println("Introduce las edades de los alumnos: ");

        //Persistencia
        double dEdad;
        int iMayorEdad;
        int iSumaEdades;
        int iNumeroAlumnos = 0;


        //Entrada
        Scanner sc = new Scanner(System.in);

        //Persistencia que es introducida mediante teclao'
        dEdad = sc.nextDouble();
        iMayorEdad = sc.nextInt();
        iSumaEdades = sc.nextInt();


        do {
            System.out.println("Primer alumno: ");
            //Si es mayor de 18 se guarda en el contador mayor de edad.
            iNumeroAlumnos++;
            if (dEdad >= 18) {
                iMayorEdad++;
            }
            //Actualizar el bucle
            dEdad = sc.nextInt();

        } while (dEdad > 0); //Condicion del bucle para que sea verdad.

        System.out.println("Numero de mayores de edad: " + iMayorEdad);
        System.out.println("Suma de edades: " + iSumaEdades);
        System.out.println("Numero de alumnos: " + iNumeroAlumnos);
        System.out.println("Media de edades: " + iSumaEdades/iNumeroAlumnos); /*redondea la media y me da igual la
                                                                                verdad paso de cambiar el tipo de dato*/




    }
}