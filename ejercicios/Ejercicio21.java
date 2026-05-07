package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese Año: ");
        int año = teclado.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0)
            System.out.println(año +" es bisiesto");
        else
            System.out.println(año + " no es bisiesto");
    }
}
