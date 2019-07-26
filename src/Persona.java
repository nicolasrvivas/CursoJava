public class Persona {

    String nombre;

    public void cambiarPersona(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }
}
