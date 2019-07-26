import java.util.Scanner;

public class Tipos_Variables_Primitivos {

    public static void main(String[] args) {


        System.out.println(" Cantidad de Bits var tipo byte  -->>  "+Byte.SIZE);
        System.out.println(" Cantidad de Bytes var tipo byte  -->>  "+Byte.BYTES);
        System.out.println(" Valor minimo en var tipo byte  -->>  "+Byte.MIN_VALUE);
        System.out.println(" Valor minimo en var tipo byte  -->>  "+Byte.MAX_VALUE);
        System.out.println("");
        System.out.println(" Cantidad de Bits var tipo Short  -->>  "+Short.SIZE);
        System.out.println(" Cantidad de Bytes var tipo Short  -->>  "+Short.BYTES);
        System.out.println(" Valor minimo en var tipo Short  -->>  "+Short.MIN_VALUE);
        System.out.println(" Valor minimo en var tipo Short  -->>  "+Short.MAX_VALUE);
        System.out.println("");
        System.out.println(" Cantidad de Bits var tipo int  -->>  "+Integer.SIZE);
        System.out.println(" Cantidad de Bytes var tipo int  -->>  "+Integer.BYTES);
        System.out.println(" Valor minimo en var tipo int  -->>  "+Integer.MIN_VALUE);
        System.out.println(" Valor minimo en var tipo int  -->>  "+Integer.MAX_VALUE);
        System.out.println("");
        System.out.println(" Cantidad de Bits var tipo long  -->>  "+Long.SIZE);
        System.out.println(" Cantidad de Bytes var tipo long  -->>  "+Long.BYTES);
        System.out.println(" Valor minimo en var tipo long  -->>  "+Long.MIN_VALUE);
        System.out.println(" Valor minimo en var tipo long  -->>  "+Long.MAX_VALUE);
        System.out.println("");

        byte byteVar=15;
        System.out.println("byteVar = " + byteVar);
        short shorVar=100;
        System.out.println("shorVar = " + shorVar);
        int intVar=500;
        System.out.println("intVar = " + intVar);
        long longVar=1000;
        System.out.println("longVar = " + longVar);


        /* Sitema Decimal */
        byte b1 = 10;
        System.out.println(" Sistema decimal    b1 = " + b1);

        /* Sitema Hexadecimal */
        byte b2 = 0xa;
        System.out.println("Sistema hexadecimal b2 = " + b2);

        /* Sitema Octal */
        byte b3 = 012;
        System.out.println(" Sistema ocatl      b3 = " + b3);

        /* Sitema Decimal */
        int b11 = 10;
        System.out.println(" Sistema decimal    b11 = " + b11);

        /* Sitema Hexadecimal */
        int b21 = 0xa;
        System.out.println("Sistema hexadecimal b21 = " + b21);

        /* Sitema Octal */
        int b31 = 012;
        System.out.println(" Sistema ocatl      b31 = " + b31);
}
}

