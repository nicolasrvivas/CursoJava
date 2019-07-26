package ContextoEstatico;

public class EjemploEstatico {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");

        //  Cuando no es contenido estatico se accede por medio del objeto, en este caso persona1
        System.out.println("persona1 = " + persona1);

        Persona persona2 = new Persona("Karla");

        //  Cuando no es contenido estatico se accede por medio del objeto, en este caso persona2
        System.out.println("persona1 = " + persona2);

        //  Cuando es contenido estatico se accede por medio de la Clase, en este caso Persona
        System.out.println("persona1.getContadorPersona = " + Persona.getContadorPersona());
    }

}

class Persona{
    private int idPersona;
    private String nombre;
    private static int contadorPersona;


    public  Persona(String nombre){
        this.idPersona = contadorPersona++;
        this.nombre = nombre;
    }

    public int getIdPersona(){
        return idPersona;
    }

    public void setIdPersona(int idPersona){
        this.idPersona=idPersona;
    }

    public String getINombre(){
        return this.nombre;
    }

    public void setIdPersona(String nombre){
        this.nombre=nombre;
    }

    public static int getContadorPersona(){
        return contadorPersona;
    }

    public String toString(){
        return "idPersona: " + idPersona + " Nombre : " + nombre;
    }
}
