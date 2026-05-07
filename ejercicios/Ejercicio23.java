package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Precio inicial kilo de uva: ");
        double precio = teclado.nextDouble();

        System.out.print("Tipo (A/B): ");
        char tipo = teclado.next().charAt(0);

        System.out.print("Tamaño (1/2): ");
        int tamaño = teclado.nextInt();

        System.out.print("Kilos: ");
        double kilos = teclado.nextDouble();

            if (tipo == 'A') {
                if (tamaño == 1) precio += 0.20;

                else precio += 0.30;

            } else {

                if (tamaño == 1) precio -= 0.30;
                
                else precio -= 0.50;
            }

            System.out.println("Ganancia: " + (precio * kilos));
    }
}
