import java.util.Scanner;

public class Convertir_String_a_Primitiovas {

    public static void main(String[] args) {


        int edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);

        Double valorPi = Double.parseDouble("3.14");
        System.out.println("valorPi = " + valorPi);

        char varChar0 = "Hola".charAt(0);
        System.out.println("varChar = " + varChar0);

        char varChar1 = "Hola".charAt(1);
        System.out.println("varChar = " + varChar1);

        char varChar2 = "Hola".charAt(2);
        System.out.println("varChar = " + varChar2);

        char varChar3 = "Hola".charAt(3);
        System.out.println("varChar = " + varChar3);

        Scanner varscanner = new Scanner(System.in);
        System.out.print("   Introduzca la Edad  -->> ");
        int varEdad = Integer.parseInt(varscanner.nextLine());
        System.out.println();
        System.out.println("   Introdujo en varEdad = " + varEdad);

        Scanner varscanner2 = new Scanner(System.in);
        System.out.print("   Introduzca el Valor de PI  -->> ");
        double varPi = Double.parseDouble(varscanner2.nextLine());
        System.out.println();
        System.out.println("   Introdujo en varEdad = " + varPi);

        Scanner varscanner3 = new Scanner(System.in);
        System.out.print("   Introduzca un caracter  -->> ");
        char varChar = (varscanner3.nextLine()).charAt(0);
        System.out.println();
        System.out.println("   Introdujo en varChar = " + varChar);

        System.out.println();
        String edadTexto = String.valueOf(20);
        System.out.println("   edadTexto = " + edadTexto);

        System.out.println();
        String valorPiTexto = String.valueOf(varPi);
        System.out.println("   valorPiTexto = " + valorPiTexto);

        System.out.println();
        String valorPiTexto2 = "" + varPi;
        System.out.println("   valorPiTexto2 = " + valorPiTexto2);

        byte b1 = 15;
        short s1 = b1;

        short s2 = 15;
        byte b2 = (byte) s2;

        short s3 = 15;
        byte b3 = (byte) (s3+1);

    }

}

