package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] n = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese número " + (i+1) + ": ");
            n[i] = teclado.nextInt();
        }

        Arrays.sort(n);
        System.out.println("Ordenados de mayor a menor: " + n[2] + " - " + n[1] + " - " + n[0]);
    }
}
