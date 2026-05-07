package ejercicios;

import java.util.Scanner;
public class Ejercicio22 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el mes: ");
        int mes = teclado.nextInt();

        switch (mes) {
            case 1,3,5,7,8,10,12 -> System.out.println("31 días");

            case 4,6,9,11 -> System.out.println("30 días");

            case 2 -> System.out.println("28 o 29 días");
            
            default -> System.out.println("Mes inválido");
        }
    }
}