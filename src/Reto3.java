/*se importa los diferentes medos que hay en la biblioteca java */
import java.util.*;
public class Reto3 {
    /*se instancia el metodo main */
    public static void main(String[] args) {
        /*nombre del reto */
    System.out.println("MAQUINA");
    /*intanciar variables*/
        int f=4,c=2, pocision;
        /*instanciar la clase scanner */
        Scanner leer = new Scanner (System.in);
        /*se intancia la matriz */
        String[][] producto = new String[f][c];
        int[][] precio = new int[f][c];
        pocision=0;
        /*se instancia la ciclo */
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                pocision++;
                /*solicitar datos */
                System.out.println("Digite el producto en la posición " + pocision);
                /*capturar datos */ 
                producto[i][j] = leer.next();
                /*solicitar datos */
                System.out.println("Digite el precio del producto en la posición " + pocision);
                precio[i][j] = leer.nextInt();
            }
        }
        
        // Impresión de los datos
        System.out.println("EL CATALOGO DE HOY ES:");
        System.out.print("\tProducto\tPrecio\n");
        pocision=0;
        /*se instancia la ciclo */
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                pocision++;
                System.out.print("pocision "+pocision+"\t"+producto[i][j]+"\t"+precio[i][j]+"\n");
            }
        System.out.println();
        }
        /*se cierra el buffer */
        leer.close();
    } 
}
