package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base, altura, area, perimetro;
        System.out.println("Ingrese la base: ");
        base = teclado.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = teclado.nextDouble();

        area = base * altura;
        perimetro = 2 * (area);

        System.out.println("Area del rectangulo: " + area);
        System.out.println("Perimetro del rectangulo: " + perimetro);
    }
}
