package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print(" Ingrese la Base: ");
        double base = teclado.nextDouble();

        System.out.print("Ingrese el Exponente: ");
        int exponente = teclado.nextInt();

        double resultado = 1;
        int numero = Math.abs(exponente);

        for (int i = 1; i <= numero; i++)
            resultado *= base;

        if (exponente < 0)
            resultado = 1 / resultado;

        System.out.println("Resultado: " + resultado);
    }
}
