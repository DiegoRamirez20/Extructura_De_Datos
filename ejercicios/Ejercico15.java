package ejercicios;

import java.util.Scanner;

public class Ejercico15 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        if (numero > 0)
            System.out.println("Positivo");
        else if (numero < 0)
            System.out.println("Negativo");
        else
            System.out.println("Es cero");
    }
}
