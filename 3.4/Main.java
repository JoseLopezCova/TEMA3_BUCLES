import java.util.Scanner;
 
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main (String args []){
        
        /*Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es árbol más alto. Para ello 
        se introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introduciendo de datos cuando 
        se utilice -1 como altura). Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 
        0. Diseñar una aplicación que resuelva el problema planteado. (pag 76)*/


    System.out.println("Introduzca la altura del arbol: ");
    
    //Persistencia 
    int iAltura;
    int iMayor = 0;
    int iEtiqueta = 0;
        
    
    do {
        Scanner sc = new Scanner(System.in);
        
        
        iAltura = sc.nextInt();
        
        if (iAltura > 0) iEtiqueta ++;
        
        if (iAltura > iMayor) iMayor = iAltura;
        
        
        
        } while(iAltura != -1);
        System.out.println("El arbol más alto es: " + iMayor + ", " + iEtiqueta);
        
        
    }
}