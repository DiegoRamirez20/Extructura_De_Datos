
package ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        double primerNumero, segundoNumero;
        
        System.out.println("Ingrese el primer numero: ");
        primerNumero = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        segundoNumero = teclado.nextDouble();
        
        System.out.println("La suma es: "+ (primerNumero + segundoNumero));
        System.out.println("La resta es: "+ (primerNumero - segundoNumero));
        System.out.println("La multiplicacion es: "+ (primerNumero * segundoNumero));
        
         if(segundoNumero != 0){
             System.out.println("La Divisicion es: "+ (primerNumero / segundoNumero));
         } else {
             System.out.println("No se puede dividir por cero");
         }      
    }
}
