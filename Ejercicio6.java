package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.println("Ingrese grados fahrenheit: ");
        fahrenheit = teclado.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Grados celsius: " + celsius);

    }

}
