package ejercicios;

public class Ejercicio2Poo {
     private String nombre;
    private String apellido;
    private int Año;
    private int documento;
    private String nacionalidad;
    private String genero;
    

    public Persona(String nombre, String apellido, int Año,int documento, String nacionalidad,String genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.Año = Año;
        this.documento = documento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    
    public void mostrarInfo() {
        System.out.println("El nombre de la persona es " + this.nombre);
        System.out.println("El apellido de " + this.nombre + " es: " + this.apellido);
        System.out.println(this.nombre + " " + this.apellido +" Nacio en el año "+ this.Año);
        System.out.println("El documento de " + this.nombre + " " + this.apellido + " es: "+ this.documento);
        System.out.println("El pais de nacimiento de " + this.nombre +  " es " + this.nacionalidad);
        System.out.println("El genero de " + this.nombre + " es " + this.genero);
    }

 
    public static void main(String[] args) {
        Persona Diego = new Persona("Diego", "Ramirez", 2010, 1001605432, "Argentina", "H");
        Persona Mariana = new Persona("Mariana", "Bedoya", 2003, 1001500321, "Colombia", "M");

        Diego.mostrarInfo();
        Mariana.mostrarInfo();
    }
}
