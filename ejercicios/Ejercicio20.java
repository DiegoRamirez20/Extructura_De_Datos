package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese Lado 1 del triangulo: ");
        double a = teclado.nextDouble();

        System.out.print("Ingrese Lado 2 del triangulo: ");
        double b = teclado.nextDouble();
        
        System.out.print("Ingrese Lado 3 del triangulo: ");
        double c = teclado.nextDouble();

            if (a == b && b == c)
                System.out.println("El triángulo es equilátero");

            else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
                System.out.println("El triángulo es rectángulo");

            else if (a == b || a == c || b == c)
                System.out.println("El triángulo es isósceles");
            
            else
                System.out.println("El triángulo es escaleno");
        }
}
