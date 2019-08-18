package PalabraFinal;

public class EjemploPalabraFinal {

    public static void main(String[] args) {
       // Modificar atributo de variable final
       // ClaseFinal.VAR_PRIMITIVA = 15;  no es posible porque esta definida como final

        // Modificar la referencia del atributo de un objeto definido como final
        //ClaseFinal.VAR_PERSONA = new Persona();no es posible porque esta definida como final

        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println("ClaseFinal.VAR_PERSONA = " + ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Carlos");
        System.out.println("ClaseFinal.VAR_PERSONA = " + ClaseFinal.VAR_PERSONA.getNombre());

    }
}
