package SobreCargaConstructores;

public class Empleado extends Persona{

    private double sueldo;

    public Empleado(String nombre,int edad,double sueldo){

        super(nombre, edad);
        this.sueldo=sueldo;

    }

    // para generar el setder y getder se pulsa boton derecho - refactor - encapsulate fields
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Barra de herramientas - code - generate - toString()
    @Override
    public String toString() {
        return super.toString()+
                " Empleado{" +
                " sueldo=" + sueldo +
                '}';
    }
}
