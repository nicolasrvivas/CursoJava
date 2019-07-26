public class PasoPorReferencia {

    public static void main(String[] args) {

       Persona p = new Persona();
       p.cambiarPersona("Juan");
       imprimirNombre(p);
       modificarPersona(p);
       imprimirNombre(p);
    }

    public static void imprimirNombre(Persona p1){
        System.out.println("Valor recibido = " + p1.obtenerNombre());
    }

    public static void modificarPersona(Persona arg2){
        arg2.cambiarPersona("Carlos");
    }
}


