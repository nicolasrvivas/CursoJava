package Aritmetica;

public class Aritmetica3_Prueba {

    public static void main(String[] args) {

        int operandoA = 6;
        int operandoB = 2;

        Aritmetica3 objeto1 = new Aritmetica3(operandoA,operandoB);

        // Imprime los operandos
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        // Imprime la suma
        System.out.println("\n objeto1.sumar() = " + objeto1.sumar());


        // Imprime la resta
        System.out.println("\n objeto1-restar() = " + objeto1.restar());

        // Imprime la resta
        System.out.println("\n objeto1-division() = " + objeto1.dividir());

        // Imprime la resta
        System.out.println("\n objeto1-multiplicar() = " + objeto1.multiplicar());

    }
}


