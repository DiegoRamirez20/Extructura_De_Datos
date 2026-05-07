package ejercicios;

public class Ejercicio3Poo {
     private float ancho;
    private float alto;


    public Rectángulo(float ancho, float alto){
        this.ancho = ancho;
        this.alto = ancho;
        
    }

    public void calcularArea(){
        System.out.println( "el area del rectángulo es: " + (this.ancho)*(this.alto));
    }

    public void calcularPerimetro(){
        System.out.println("el perimetro del rectangulo es: "+(2*(this.ancho)*(this.alto)));
    }

    public static void main(String[] args) {
        Rectángulo rectangulo1 = new Rectángulo(10, 4);
        Rectángulo rectangulo2 = new Rectángulo(18, 12);

        rectangulo1.calcularArea();
        rectangulo2.calcularPerimetro();
    }
}
