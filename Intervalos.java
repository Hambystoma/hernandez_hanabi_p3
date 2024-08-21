/**                                                                             
* @author Hanabi Hernández Arce                                                
* @version 1.0                                                                  
* @date 20 aug 2024                                                           
*/
import java.util.Scanner;
public class Intervalos{
    public static void main (String[]pps){
        Scanner teclado = new Scanner(System.in); //Declaro el scanner que usaré
        System.out.println("Ingrese el valor a: ");
        int a = teclado.nextInt();
        System.out.println("Ingrese el valor b: ");
        int b = teclado.nextInt();
        System.out.println("Ingrese el valor c: ");
        int c = teclado.nextInt();
        if(a<=c && b>=c){
            System.out.println("INTERVALO");
        }else{
            if(a>c){
                System.out.println("IZQUIERDA");
            }else{
                System.out.println("DERECHA");
            }
        }
    }
}
