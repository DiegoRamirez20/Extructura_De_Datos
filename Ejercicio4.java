package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double catetoUno, catetoDos, hipotenusa;

        System.out.println("Ingrese el cateto 1: ");
        catetoUno = teclado.nextDouble();
        System.out.println("Ingrese el cateto 2: ");
        catetoDos = teclado.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(catetoUno, 2) + Math.pow(catetoDos, 2));

        System.out.println("La hipotenusa es: " + hipotenusa);

    }
}
