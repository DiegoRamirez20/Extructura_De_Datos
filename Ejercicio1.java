package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Hola " + nombre + ", bienvenindo!");
    }
}
