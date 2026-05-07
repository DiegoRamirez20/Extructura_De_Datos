package ejercicios;

import java.util.Scanner;

public class Ejercicio34 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        int nuemro = teclado.nextInt();

        double total = 0;
        for (int i = 1; i <= nuemro; i++) {
            System.out.print("Horas trabajadas empleado " + i + ": ");
            double horas = sc.nextDouble();

            System.out.print("Pago por hora: ");
            double pago = sc.nextDouble();

            double sueldo = horas * pago;
            total += sueldo;
            System.out.println("Sueldo: " + sueldo);
            
        }
        System.out.println("Total pagado por la empresa: " + total);
    }
}
