package Encapsulamieto;

public class PruebaPersonaEncapsular {
    public static void main(String[] args) {
        PersonaEncapsular persona1 = new PersonaEncapsular("Nicolas","Vivas",true);
        //  System.out.println("persona1.nombre = " + persona1.nombre);
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        persona1.setNombre("Ricardo");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        persona1.setborrado(false);
        System.out.println("persona1 = " + persona1);
    }
    


}
