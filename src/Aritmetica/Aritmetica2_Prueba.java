package Aritmetica;

public class Aritmetica2_Prueba {

    public static void main(String[] args) {

        Aritmetica2 objeto1 = new Aritmetica2();
        objeto1.a=5;
        objeto1.b=3;

        int resultado = objeto1.sumar();
        System.out.println("resultado = " + resultado);

        Aritmetica2 objeto2 = new Aritmetica2(2,4);
        System.out.println("resultado2 = " + objeto2.sumar());
    }
}


