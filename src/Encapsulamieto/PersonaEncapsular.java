package Encapsulamieto;

public class PersonaEncapsular {
    private String nombre;
    private String apellido;
    private boolean borrado;

    public PersonaEncapsular(String nombre,String apellido,boolean borrado){
        this.nombre=nombre;
        this.apellido=apellido;
        this.borrado=borrado;
    }

    public PersonaEncapsular(){

    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getapellido(){
        return this.apellido;
    }

    public void setapellido(String apellido){
        this.apellido = apellido;
    }

    public boolean isBorrado(){
        return this.borrado;
    }

    public void setborrado(boolean borrado){
        this.borrado = borrado;
    }

    public String toString(){
        return " Nombre: "+nombre+" Apellido: "+apellido+" Borrado: "+borrado;
    }

}

