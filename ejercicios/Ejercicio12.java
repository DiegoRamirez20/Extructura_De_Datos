package ejercicios;

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        int a = teclado.nextInt();
        
        System.out.print("Ingrese el valor de B: ");
        int b = teclado.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A = " + a + " | B = " + b);
    }
}