import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner varscanner = new Scanner(System.in);

        System.out.print("\n" + " Proporciona numero 1   :  ");
        int v_numero1 = Integer.parseInt(varscanner.nextLine());

        System.out.print("\n" + " Proporciona numero 2   :  ");
        int v_numero2 = Integer.parseInt(varscanner.nextLine());

        if (v_numero1 > v_numero2) {
            System.out.println("v_numero1 es mayor que v_numero2");
        } else {
            if (v_numero1 < v_numero2) {
                System.out.println("v_numero1 es menor que v_numero2");
            } else {
                System.out.println("v_numero1 es igual que v_numero2");
            }
        }
        int mayor = (v_numero1 > v_numero2) ? v_numero1 : v_numero2;
        System.out.println("mayor = " + mayor);

    }
}


