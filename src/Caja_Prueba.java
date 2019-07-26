public class Caja_Prueba {

    public static void main(String[] args) {

        int operandoAncho    = 6;
        int operandoAlto      = 2;
        int operandoProfundo = 2;

        Caja objeto1 = new Caja(operandoAncho,operandoAlto,operandoProfundo);

        // Imprime los operandos
        System.out.println("operandoAncho    = " + operandoAncho);
        System.out.println("operandoAlto     = " + operandoAlto);
        System.out.println("operandoProfundo = " + operandoProfundo);

        // Imprime la suma
        System.out.println("\n objeto1.calculoVolumen() = " + objeto1.calculoVolumen());



    }
}


