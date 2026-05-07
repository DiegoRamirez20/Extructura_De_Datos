package ejercicios;

import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

            System.out.print("Número 1: ");
            int numero1 = teclado.nextInt();
            
            System.out.print("Número 2: ");
            int numero2 = teclado.nextInt();

            if (n1 > n2)
                System.out.println("El # mayor es: " + numero1);
            else
                System.out.println("El # mayor es: " + numero2);
    }
}