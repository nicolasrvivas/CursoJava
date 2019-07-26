public class Operador_relacional_igualdad {

    public static void main(String[] args) {


        int a = 3, b = 2;
        boolean c = (a==b);
        System.out.println("c = " + c);

        boolean d = (a!=b);
        System.out.println("c = " + d);

        String e = "Hola", f = "hola";
        boolean g = e.equals(f);
        System.out.println("g = " + g);

        boolean h = (a>=b);
        System.out.println("h = " + h);

        boolean i = (a<=b);

        if (a % 2 == 0)
            System.out.println("a = Par");
        else
            System.out.println("a = Impar");

        if (b % 2 == 0)
            System.out.println("b = Par");
        else
            System.out.println("b = Impar");

        if (b % 2 != 0)
            System.out.println("b = Impar");
        else
            System.out.println("b = Par");

        int edad = 17;
        int adulto = 18;
        if (edad >= adulto)
            System.out.println("es un adulto , edad = " + edad);
        else
            System.out.println("es un menor , edad = " + edad);


    }
}

