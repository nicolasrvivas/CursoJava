package Operadores;

public class Operador_condicional {

    public static void main(String[] args) {

        int a = 3;
        int valorMin =0, valorMax = 10;
        boolean b = (a<= valorMin && a>=valorMax);
        if (b)
            System.out.println("Esta dentro del rango  = " + a);
        else
            System.out.println("Esta dentro del rango  = " + a);

        if (a<= valorMin && a>=valorMax)
            System.out.println("Esta dentro del rango  = " + a);
        else
            System.out.println("Esta dentro del rango  = " + a);

        boolean vacaciones = false;
        boolean diaDescanso = true;
        if (vacaciones || diaDescanso)
            System.out.println("Padre asiste a juego de su hijo");
        else
            System.out.println("Padre ocupado");

    }
}

