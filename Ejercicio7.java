
package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double numero1, numero2, numero3, promedio;
        
        System.out.println("Ingrese el numero 1: ");
        numero1 = teclado.nextDouble();
        
        System.out.println("Ingrese el numero 2: ");
        numero2 = teclado.nextDouble();
        
        System.out.println("Ingrese el numero 3: ");
        numero3 = teclado.nextDouble();
        
        promedio = (numero1 + numero2 + numero3) / 3;
        
        System.out.println("La medida de los tres numeros es: "+ promedio);
    }
    
}
