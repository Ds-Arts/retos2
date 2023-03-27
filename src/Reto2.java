/*se importa los diferentes medos que hay en la biblioteca java */
import java.util.*;
public class Reto2 {
    /*se instancia el metodo main */
    public static void main(String[] args) {
        /*nombre del reto */
    System.out.println("NADADORES");
    /*intanciar variables*/
        int n, minimo, puesto, competidores = 0, a;
        /*instanciar la clase scanner */
        Scanner leer = new Scanner(System.in);
        System.out.println("NADAROTES");
        /*solicitar datos */
        System.out.println("digite el numero de nadadores el cual su maximo es 6");
        /*capturar datos */ 
        n = leer.nextInt();
        /*se intancia el arreglo */
        int[] tiempo = new int[n];
        /*se instancia la ciclo */
        for (int i = 0; i < tiempo.length; i++) {
            competidores++;
            /*solicitar datos */
            System.out.println("digite el tiempo de competidor " + competidores);
            /*capturar datos */ 
            tiempo[i] = leer.nextInt();
        }
        /*se instancia la ciclo */
        for (int i = 0; i < tiempo.length; i++) {
            minimo = i;
            for (int j = 0; j < tiempo.length; j++) {
                /*instnciar la condicion if con diferentes casos que puede haber*/
                if (tiempo[j] < tiempo[minimo]) {
                    minimo = j;
                }
            }
            a = tiempo[i];
            tiempo[i] = tiempo[minimo];
            tiempo[minimo] = a;
        }
        puesto = n;
        /*se instancia la ciclo */
        for (int i = 0; i < tiempo.length; i++) {
            competidores++;
            System.out.println("competidor " + competidores + " su puesto es " + puesto + " con el tiempo de " + tiempo[i]);
            puesto--;
        }
        System.out.println("ganador el puesto 1");
        /*se cierra el buffer */
        leer.close();
    } 
}
