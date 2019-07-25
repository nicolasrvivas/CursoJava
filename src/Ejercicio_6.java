import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = a+1;
        int d = 6/c;
        int e = d*4;
        int f = b-1;
        int g = b-1;
        int h = -3 + e - b + f;
        System.out.println("1ra operacion sumar 1 a la variable a = " + c);
        System.out.println("2da operacion dividir 6 entre el nuevo valor de a ["+a+"] = " + d);
        System.out.println("3da operacion multiplicar "+d+" por 4 = " + e);
        System.out.println("4ta operacion es ==>> -3 +"+e+"-"+g+"b (decrementado en 1");
        System.out.println("5t0 Rsultado total es ==>>> "+h);

        System.out.println();
        int a2 = 2;
        int b2 = 3;
        int res = -3 + 6 / ++a2 * 4 - b2-- + b2;
        System.out.println("res = -3 + 6 / ++a2 * 4 - b2-- + b2");
        System.out.println("res                   ==>>> " + res);

    }
}


