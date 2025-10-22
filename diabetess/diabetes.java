import java.util.Scanner;

/**
 * Write a description of class diabetes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class diabetes {
    public static void main(String[] args) {
        
        //Entrada
        System.out.println("¿Cuántos mg/dl tiene en sangre la persona?");
        
        //Entrada datos...
        Scanner sc =  new Scanner(System.in);
        
        //Persistencia de datos
        int iNum = sc.nextInt();
        String respuesta = sc.nextLine().toLowerCase();
        
        //Proceso
        if (iNum >= 70 && iNum <= 110) {
            System.out.println("Es un nivel de azúcar en sangre normal");
        } else if (iNum > 180) { 
            System.out.println("Es hiperglucemia");
            System.out.println("Administrar agua y avisar a su familia");
        } else if (iNum > 70) {
            System.out.println("Es hipoglucemia");    
            //Preguntamos si mi colega esta fino o no
            System.out.println();
            System.out.println("¿Está consciente?");
            
            if (respuesta.equals("si")) {
                System.out.println();
                System.out.println("Dar liquidos azucarados y repetir la prueba en 5 minutos");
            } else if (respuesta.equals("no")) {
                System.out.println("Avisar a familia y a emergencias y administrar glucagón");
            } else System.out.println("La respuesta tiene que ser si o no");
        } 
    }    
}