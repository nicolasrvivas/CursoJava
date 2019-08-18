package LaboratorioFinal.MundoPC;

import ClaseDiseño.GMVentas.Producto;

public class Computadora {

    private int idComputadora;
    private static int contadorComputadora;
    private String nombre;
    private double precio;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;


    private Computadora() {

        this.idComputadora = ++contadorComputadora;
    }

    public Computadora(String nombre,  Monitor monitor, Raton raton, Teclado teclado, double precio) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
        this.precio = precio;

    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                ", Monitor='" + monitor + '\'' +
                ", Teclado='" + teclado + '\'' +
                ", Raton='" + raton + '\'' +
                '}';
    }
}
