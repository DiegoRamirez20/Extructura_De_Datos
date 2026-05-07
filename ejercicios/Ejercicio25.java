package ejercicios;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la duración de llamada (min): ");
        int minuto = teclado.nextInt();
        double costo = 0;

        if (minuto <= 5) costo = 1;

        else if (minuto <= 8) costo = 1 + (minuto - 5) * 0.8;

        else if (minuto <= 10) costo = 1 + 3 * 0.8 + (min - 8) * 0.7;

        else costo = 1 + 3 * 0.8 + 2 * 0.7 + (minuto - 10) * 0.5;

        System.out.print("¿Es domingo? (true/false): ");
        boolean domingo = teclado.nextBoolean();

        if (domingo) costo *= 1.03;

        else {
            System.out.print("Turno (mañana/tarde): ");
            String turno = teclado.next();
            costo *= turno.equals("mañana") ? 1.15 : 1.10;
        }

        System.out.println("Costo total: " + costo);
    }
}
