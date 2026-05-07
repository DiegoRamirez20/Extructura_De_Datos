package ejercicios;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, suma = 0, cont = 0;

        do {
            System.out.print("Ingrese un número: ");
            n = teclado.nextInt();
            
            if (numero != 0) {
                suma += n;
                cont++;
            }
        } while (numero != 0);

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (double)suma / cont);
    }
}
