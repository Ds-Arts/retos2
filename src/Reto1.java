/*se importa los diferentes medos que hay en la biblioteca java */
import java.util.*;
public class Reto1 {
    /*se instancia el metodo main */
    public static void main (String [] args) {
        /*nombre del reto */
    System.out.println("MULTIPLOS DE DOS");
    /*intanciar variables*/
        int n, multiplo=0;
        /*instanciar la clase scanner */
        Scanner leer = new Scanner (System.in);
        /*solicitar datos */
        System.out.println("digite el numero de edades que quiera digitar");
          n=leer.nextInt();
          /*se intancia el arreglo */
          int [] notas=new int [n];
          /*se instancia la ciclo */
          for (int i=0; i<=n;i++){
            /*solicitar datos */
            System.out.println("digite el numero que desee");
            /*capturar datos */ 
            notas[i]=leer.nextInt();
            multiplo=notas [i] % 2;
            /*instnciar la condicion if con diferentes casos que puede haber*/
            if(multiplo==0){
              System.out.println("su numero es multiplo de 2");
            }else{
              System.out.println("su numero es no multiplo de 2");
            }
          }
          System.out.println("gracias por usar nuestro programa");
        leer.close();
      }
}
