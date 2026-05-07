package ejercicios;

import java.util.Scanner;

public class Ejercicio33 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        boolean primo = numero > 1;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (numero % i == 0)
                primo = false;

        System.out.println(primo ? "Es primo" : "No es primo");
    }
}
