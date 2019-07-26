public class Operador_ternario {

    public static void main(String[] args) {

        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Numero Par" : "Numero Impar";
        System.out.println("resultado = " + resultado);

        boolean resultado2 = (numero % 2 == 0) ? true : false;

        if (resultado2)
            System.out.println("Numero Par");
        else
            System.out.println("Numero Impar");
    }
}

