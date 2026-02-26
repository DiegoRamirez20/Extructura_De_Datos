package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad, edadFutura;
        System.out.println("Ingrese su edad:");
        edad = teclado.nextInt();
        edadFutura = edad + 10;

        System.out.println("En 1o años tendras " + edadFutura + " años");
    }
}
