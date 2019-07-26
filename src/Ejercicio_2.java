import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n"+" Proporciona El Nombre :  ");
        String v_nombre = scanner.nextLine();

        System.out.print("\n"+" Proporciona ID        :  ");
        String v_Id = scanner.nextLine();

        Scanner varscanner2 = new Scanner(System.in);
        System.out.print("\n"+" Proporciona Precio    :  ");
        double varPrecio = Double.parseDouble(varscanner2.nextLine());

        Scanner varscanner3 = new Scanner(System.in);
        System.out.print("\n"+" Proporciona Simbolo   :  ");
        char varSimbolo = (varscanner3.nextLine()).charAt(0);

        Scanner varscanner4 = new Scanner(System.in);
        System.out.print("\n"+" Proporciona el envio gratuito  : ");
        boolean varEnvio = Boolean.parseBoolean(varscanner4.nextLine());

        System.out.println();
        System.out.println("  nombre  = " + v_nombre);
        System.out.println("  Id      = " + v_Id);
        System.out.println("  Precio  = " + varPrecio);
        System.out.println("  Simbolo = " + varSimbolo);
        System.out.println("  Envio   = " + varEnvio);
    }
}

