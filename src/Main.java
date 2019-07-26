import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n"+" Introduzca nombre :  ");
        String usuario = scanner.nextLine();
        String saludar = "Saludos";
        System.out.println(saludar + " " + usuario);
    }
}

