import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//  Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100 (generado aleatoriamente).
//Para ellos se introduce por teclado una serie de números, para los que se indica: “mayor” o “menor”, según sea
//mayor o menor con respecto al número secreto. El proceso termina cuando el usuario acierta o cuando se rinde
//(introduciendo un -1). (pág. 75)

        int iNumeroAleatorio = (int)(Math.random() * 100) + 1;
        int iNumTeclado;

            System.out.println("Introduce un número por teclado que se acerque al número secreto entre 1 y 100: ");
        do {
            Scanner sc = new Scanner(System.in);
            iNumTeclado = sc.nextInt();
            if (iNumTeclado > iNumeroAleatorio) System.out.println("Menor"); else System.out.println("Mayor");
        } while(iNumTeclado != iNumeroAleatorio || iNumTeclado == -1);
            System.out.println("El numero aleatorio es: " + iNumeroAleatorio);


    }
}