import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {

        Scanner varscanner = new Scanner(System.in);

        System.out.print("\n" + " Proporciona la nota   :  ");
        double v_nota= Double.parseDouble(varscanner.nextLine());

        if (v_nota>= 9 && v_nota <= 9) {
            System.out.println("   La nota es ==>>>  A");
        } else if (v_nota>= 8 && v_nota < 9) {
            System.out.println("   La nota es ==>>>  B");
        } else if (v_nota>= 7 && v_nota < 8) {
            System.out.println("   La nota es ==>>>  C");
        } else if (v_nota>= 6 && v_nota < 7) {
            System.out.println("   La nota es ==>>>  D");
        } else if (v_nota>= 0 && v_nota < 6) {
            System.out.println("   La nota es ==>>>  F");
        } else {
            System.out.println("   La notas no esta en el rango entre 0 y 10");
        }

    }
}


