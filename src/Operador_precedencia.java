public class Operador_precedencia {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println(" Precedencia de operadores  - revisar tabla de precedencia de operadores");
        int resultado = 4 + 5 * 6 / 3;
        System.out.println("reultado = " + resultado);

        resultado = (4+5) *(6/3);
        System.out.println("resultado = " + resultado);

    }
}

