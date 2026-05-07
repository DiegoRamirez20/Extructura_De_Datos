package ejercicios;

import javax.swing.JOptionPane;
public class Ejercicio13 {
     public static void main(String[] args) {
         String distancia =JOptionPane.showInputDialog( null,  "Ingrese la distancia entre los vehiculos en (Km): ");
         String velocidad1 =JOptionPane.showInputDialog( null,  "Velocidad del vehículo mas lento en (Km/h) : ");
         String velocidad2 =JOptionPane.showInputDialog( null,  "Velocidad del vehículo mas rapido en (Km/h) : ");
         
        JOptionPane.showMessageDialog(null, "El vehiculo mas rápido alcanzara al otro en: " + ((Double.parseDouble(distancia)) / (Double.parseDouble(velocidad2) - Double.parseDouble(velocidad1)) * 60 ));
    }
}