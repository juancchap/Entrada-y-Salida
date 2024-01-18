
package entrada.y.salida;
import java.util.Scanner;
/**
 *
 * Autor: Juan Carlos Chaparro Dominguez
 */
public class EntradaYSalida {

   
    public static void main(String[] args) {
        int edad;
        
      Scanner entrada = new Scanner(System.in);        
        System.out.println("Escribe tu edad: ");        
        edad=entrada.nextInt();
        System.out.println("Tu edad es: "+edad);
        
    }
    
}
