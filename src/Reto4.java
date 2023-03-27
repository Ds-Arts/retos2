/*se importa los diferentes medos que hay en la biblioteca java */
import java.util.*;
public class Reto4 {
    /*se instancia el metodo main */
    public static void main(String[] args) {
        /*nombre del reto */
    System.out.println("CONCENTRESE");
    /*intanciar variables*/
        int p, c;
        /*instanciar la clase scanner */
        Scanner leer = new Scanner (System.in);
        /*solicitar datos */
        System.out.println("digite el numero de filas con las que desea ");
        /*capturar datos */ 
        p=leer.nextInt();
        System.out.println("digite el numero de columnas con las que desea ");
        c=leer.nextInt();
        /*se intancia la matriz*/
        String[][] palabra =new String [p][c];
        /*se instancia la ciclo */
         for(int i=0; i<p; i++){
            for(int j=0; j<p; j++){
                /*solicitar datos */
                System.out.println("digite la palabra que desee");
                /*capturar datos */ 
                palabra[i][j]=leer.next();
            }
        }
        System.out.println("INTERFAZ");
            for(int i=0; i<p; i++){
                for(int j=0; j<p; j++){
                    System.out.print(palabra[i][j]+"\t");
                 }
                 System.out.println();
         }
         /*se intancia el arreglo */
         int[] frecuencia = new int[p * c];
         /*se instancia la ciclo */
         for (int i = 0; i < p; i++) {
             for (int j = 0; j < c; j++) {
                 int contador = 0;
                 for (int k = 0; k < p; k++) {
                     for (int l = 0; l < c; l++) {
                        /*instnciar la condicion if con diferentes casos que puede haber*/
                         if (palabra[i][j].equals(palabra[k][l])) {
                             contador++;
                         }
                     }
                 }
                 frecuencia[i * c + j] = contador;
                 if (contador > 1) {
                     System.out.println("La palabra " + palabra[i][j] + " se repite " + contador + " veces.");
                 }
             }
         }
         /*se cierra el buffer */
         leer.close();
     }
}
