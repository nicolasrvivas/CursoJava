package SobreCargaMetodos;

public class Operaciones {

    public static int suma(int a , int b){
        System.out.print(" Suma (int a , int b)       :");
        return a + b;
    }

    public static double suma(double a , double b){
        System.out.print(" Suma (double a , double b) :");
        return a + b;
    }

    public static double suma(int a , double b){
        System.out.print(" Suma (int a , double b)    :");
        return a + b;
    }

    public static double suma(double a , int b){
        System.out.print(" Suma (double a , int b)    :");
        return a + b;
    }
}
