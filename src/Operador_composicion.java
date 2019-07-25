import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n"+" Proporciona Título :  ");
        String v_titulo = scanner.nextLine();

        System.out.print("\n"+" Proporciona Autor :  ");
        String v_Autor = scanner.nextLine();

        String saludar = "Saludos";
        System.out.println("\n" + " " + v_titulo + " fue escrito por "+v_Autor);
    }
}

