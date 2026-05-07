package ejercicios;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero = (int)(Math.random() * 100 + 1);
        int intentos = 10;

        while (intentos > 0) {
            System.out.print("Intenta adivinar el número: ");
            int numeroAdivinsar = teclado.nextInt();
            intentos--;

            if (numeroAdivinsar == numero) {
                System.out.println("¡Acertaste!");
                return;
            } else if (numeroAdivinsar < numero)
                System.out.println("Mayor");
            else
                System.out.println("Menor");

            System.out.println("Intentos restantes: " + intentos);
        }
        System.out.println("Perdiste. El número era " + numero);
    }
}
