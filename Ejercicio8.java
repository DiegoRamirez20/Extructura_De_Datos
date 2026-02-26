package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sueldoBase, totalVentas, comision, sueldoTotal;

        System.out.print("Ingrese sueldo base: ");
        sueldoBase = teclado.nextDouble();

        totalVentas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese valor de venta " + i + ": ");
            totalVentas += teclado.nextDouble();
        }

        comision = totalVentas * 0.10;
        sueldoTotal = sueldoBase + comision;

        System.out.println("Comision total: " + comision);
        System.out.println("Sueldo total del mes: " + sueldoTotal);
    }

}
