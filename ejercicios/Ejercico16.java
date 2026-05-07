package ejercicios;

import java.util.Scanner;

public class Ejercico16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0)
            System.out.println( n +" es par");
        else
            System.out.println(n + " es impar");
    }
}
