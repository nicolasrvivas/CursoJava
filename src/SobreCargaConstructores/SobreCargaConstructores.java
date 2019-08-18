package SobreCargaConstructores;

public class SobreCargaConstructores {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Lilia",25);
        System.out.println("persona1 = " + persona1);
        
        Empleado empleado1 = new Empleado("Pedro", 28, 100000);
        System.out.println("empleado1 = " + empleado1);
    }
}
