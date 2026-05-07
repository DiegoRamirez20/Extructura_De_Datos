package ejercicios;

import java.util.Scanner;

public class Ejercicio31 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Inicio: ");
        int a = teclado.nextInt();
        
        System.out.print("Fin: ");
        int b = teclado.nextInt();

        for (int i = a; i <= b; i++)
            if (i % 2 == 0)
                System.out.print(i + " ");
    }
}
