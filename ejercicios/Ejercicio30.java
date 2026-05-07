package ejercicios;

import java.util.Scanner;

public class Ejercicio30 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números: ");
        int cantidadN= teclado.nextInt();

        int positivo = 0, negativo = 0, cero = 0;
        for (int i = 0; i < cantidadN; i++) {
            int numero = teclado.nextInt();
            if (numero > 0) positivo++;
            else if (numero < 0) negativo++;
            else cero++;
        }

        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
        System.out.println("Ceros: " + cero);
    }
}
