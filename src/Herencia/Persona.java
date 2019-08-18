package Herencia;

public class Persona {

    private String nombre;
    private String genero;
    private int edad;
    private String direccion;

    public Persona() {

    }



    public Persona(String nombre) {
        this.nombre=nombre;

    }

    public Persona(String nombre, String genero, int edad, String direccion) {
        this.nombre = nombre;
        this. genero = genero;
        this.edad = edad;
        this.direccion = direccion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
