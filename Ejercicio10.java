package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double parcial1, parcial2, parcial3, examen, trabajo, promedioParciales, notaFinal;

        System.out.print("Nota parcial 1: ");
        parcial1 = teclado.nextDouble();

        System.out.print("Nota parcial 2: ");
        parcial2 = teclado.nextDouble();

        System.out.print("Nota parcial 3: ");
        parcial3 = teclado.nextDouble();

        System.out.print("Nota examen final: ");
        examen = teclado.nextDouble();

        System.out.print("Nota trabajo final: ");
        trabajo = teclado.nextDouble();

        promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        notaFinal = (promedioParciales * 0.55)
                + (examen * 0.30)
                + (trabajo * 0.15);

        System.out.println("Calificación final: " + notaFinal);
    }

}
