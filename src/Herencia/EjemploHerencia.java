package Herencia;
 import java.util.Date;
public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 25000);
        empleado1.setEdad(28);
        empleado1.setGenero("M");
        empleado1.setDireccion("Chille");
        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente(new Date(),true);
        cliente1.setNombre("Karla");
        cliente1.setEdad(31);
        cliente1.setGenero("F");
        cliente1.setDireccion("Santiago");
        System.out.println("cliente1 = " + cliente1);
    }
}
