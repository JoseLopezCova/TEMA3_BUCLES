import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*  Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo y su cuadrado.
            El proceso se repetirá hasta que el número introducido sea 0. (pag 74)*/

        //Entrada
        System.out.println("Introduzca un número por teclado se indicará si es par, si positivo y se mostrará su cuadrado: ");

        //Persistencia
        int iNum;
        //Entrada
        Scanner sc = new Scanner(System.in);
        //Persistencia
        iNum = sc.nextInt();

        //Bucle
        do {
            //Ejecuta primera condicion
            if (iNum % 2 == 0) {
                System.out.println("Es par");
                //Si es verdad es par y sale por pantalla:




            } else {
                System.out.println("Es impar");
                //Si es mentira es impar y sale por pantalla:
            }

                //Si es es verdad sale por pantalla:
            if (iNum >= 0) {
                System.out.println("Es positivo");

                //Si es mentira sale por pantalla:
            } else {
                System.out.println("Es negativo");
            }

            System.out.println((iNum * iNum) + " Este es su cuadrado"  );
            iNum= sc.nextInt();
            //Al final del bucle pide de nuevo la variable int que es dependiente en el scanner, para que se actualice el bucle

            //Condicion que permite que el bucle siga adelante
        }while (iNum != 0);


    }
}