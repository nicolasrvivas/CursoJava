public class PasoPorValor {

    public static void main(String[] args) {

        int x   = 10;
        imprimir(x);
        x=15;
        cabiarValor(x);

        imprimir(x);

    }

    public static void imprimir(int arg1){
        System.out.println("arg1 = " + arg1);
    }

    public static void cabiarValor(int arg2){
        arg2=20;
    }
}


