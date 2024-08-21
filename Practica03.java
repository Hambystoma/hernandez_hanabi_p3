/**                                                                             
* @author Hanabi Hernández Arce                                                
* @version 1.0                                                                  
* @date 20 aug 2024                                                           
*/
import java.util.Scanner;
public class Practica03{
    public static void main (String[]pps){
        Scanner teclado = new Scanner(System.in); //Declaro dos scanners distintos porque despues de leer un int no me funcionaba :c
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del remitente: "); //Pregunto al usuario el nombre del remitente
        String rem = scanner.nextLine();//El usuario ingresa el nombre del remitente
        System.out.print("Profesion del remitente: "); //Pregunto al usuario la profesion del mismo
        String profRem = scanner.nextLine();//El usuario ingresa la profesion del remitente
        String tresLetrasRem = profRem.substring(0,3);//Creamos un nuevo String que solo contiene las primeras tres letras de la profesion del remitente
        System.out.print("Nombre del destinatario: "); //Todo lo que hicimos con el remitente se hace nuevamente, pero esta vez con el destinatario
        String dest = scanner.nextLine();
        System.out.print("Profesion del destinatario: ");
        String profDest = scanner.nextLine();
        String tresLetrasDest = profDest.substring(0,3);
        System.out.print("Mensaje: "); //Pregunto al usuario el mensaje que desea escribir
        String mensaje = scanner.nextLine(); //El usuario ingresa el mensaje
        int letrasMensaje = mensaje.length();//Cuento el numero de letras que contiene el mensaje
        System.out.print("¿Este mensaje es URGENTE? (1=SI / 2=NO): "); //Pregunto al usuario si su mensaje es urgente
        int urg = scanner.nextInt(); //El usuario decide si es urgente o no
        System.out.print("Direccion del destinatario (Formato: Calle numero.ciudad CP): "); //Pregunto al usuario la direccion del destinatario
        String direc = teclado.nextLine(); //El usuario ingresa la direccion siguiendo el formato indicado y terminamos con la entrada de datos
        System.out.println("\n \n"); //Separacion de la entrada y la salida
        System.out.println("De: "+tresLetrasRem+". "+rem);//Aqui se muestra la informacion del remitente
        System.out.println("Para: "+tresLetrasDest+". "+dest);//Aqui se muestra la informacion del destinatario
        System.out.println("Mensaje: \n     "+mensaje);//Aqui se muestra el mensaje
        String urgencia = (urg == 1) ? "Este mensaje es ¡URGENTE! \n Costo: $"+letrasMensaje*4+"\n Tu mensaje tiene "+letrasMensaje+" letras. El costo por letra es de $4.0" : "Este mensaje NO es urgente. "+
        "\n Costo: $"+letrasMensaje*2+"\n Tu mensaje tiene "+letrasMensaje+" letras. El costo por letra es de $2.0";//Aqui uso un operador ternario para conocer el costo del mensaje, su longitud y su prioridad
        System.out.println(urgencia); //Y en esta parte se imprime lo anterior
        System.out.println("Direccion:"); //Finalmente tenemos la direccion del destinatario
        int punto = direc.indexOf('.'); //Estos son los valores que necesitamos para concatenar y editar el String de la direccion
        int espacio1 = direc.indexOf(' ');
        int espacio2 = direc.indexOf(' ', punto);
        //La linea inferior es unicamente la concatenacion del nuevo String que creamos para que se adapte al formato que deseamos en la salida
        String direc2 = direc.substring(0, espacio1)+" "+direc.substring(espacio1 +1, punto)+"\n"+direc.substring(punto +1, espacio2)+" "+direc.substring(espacio2 +1);
        String direcMayus = direc2.toUpperCase(); //Uso el  toUpperCase para convertir todo el String anterior en mayusculas
	    System.out.println(direcMayus); //Imprimimos la direccion y finalizamos la salida de datos
    }
}