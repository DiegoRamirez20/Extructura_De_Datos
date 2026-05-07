package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario = "admin";
        String clave = "1234";

        System.out.print("Usuario: ");
        String user = teclado.nextLine();
        
        System.out.print("Contraseña: ");
        String pass = teclado.nextLine();

        if (user.equals(usuario) && pass.equals(clave))
            System.out.println("Has entrado al sistema");
        else
            System.out.println("Usuario o contraseña incorrectos");
    }
}
