import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner varscanner = new Scanner(System.in);

        System.out.print("\n"+" Proporciona El Alto   :  ");
        int v_Alto = Integer.parseInt(varscanner.nextLine());

        System.out.print("\n"+" Proporciona El Ancho  :  ");
        int v_Ancho = Integer.parseInt(varscanner.nextLine());

        int v_Area = v_Alto * v_Ancho;

        System.out.println("  v_Area = " + v_Area);

        int v_Perimetro = (v_Alto + v_Ancho) * 2;

        System.out.println("  v_Perimetro = " + v_Perimetro);


    }
}

