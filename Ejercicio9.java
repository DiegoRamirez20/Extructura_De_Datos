
package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        double total, descuento, totalFinal;
        System.out.print("Ingrese total de la compra: ");
    total = teclado.nextDouble();
    
    descuento = total * 0.15;
    totalFinal = total - descuento;
    
    System.out.println("Descuento: " + ((int) descuento));
    System.out.println("Total a pagar: " + ((int) totalFinal));
    }
}
