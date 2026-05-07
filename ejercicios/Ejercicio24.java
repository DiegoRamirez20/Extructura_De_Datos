package ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número de alumnos que viajan: ");
        int numero = teclado.nextInt();

        double costoAlumno, total;

            if 
                (numero >= 100) costoAlumno = 65;

            else if
                (numero >= 50) costoAlumno = 70;

            else if 
                (numero >= 30) costoAlumno = 95;

            else {
                total = 4000;
                costoAlumno = total / numero;
                
                System.out.println("Pago a la empresa: " + total);
                System.out.println("Pago por alumno: " + costoAlumno);
                return;
            }

            total = costoAlumno * n;
            System.out.println("Pago a la empresa: " + total);
            System.out.println("Pago por alumno: " + costoAlumno);
    }
}
