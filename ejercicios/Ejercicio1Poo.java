package ejercicios;

public class Ejercicio1Poo {
     private double numeroNuenta;
    private String nombreTitular;
    private float saldo;
    

    public CuentaBancaria(double numeroNuenta, String nombreTitular, float saldo) {
        this.numeroNuenta = numeroNuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void ConsignarDinero(double monto){
         if (monto > 0) {
           saldo += monto;
           System.out.println("Consignación exitosa. Monto: $" + monto);
      } else {
           System.out.println("El monto a consignar debe ser mayor que cero.");    
             }
    
    }

    public void retirar(double monto){
       if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Monto: $" + monto);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    public void ConsultarSaldo(){
        System.out.println("Saldo actual: $" + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuentaDiego = new CuentaBancaria(399503480, "Diego", 100000000);

        cuentaDiego.ConsultarSaldo();
        cuentaDiego.ConsignarDinero(500000);
        cuentaDiego.retirar(800000);
    }
}
