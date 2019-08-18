package Matrices;

public class EjemploMatrices {

    public static void main(String[] args) {
        // 1.- Declarar una matriz de int
        int edades[][];

        // 2.- Instaciar la matriz
        edades = new int[3][2];

        // 3.- Iniciar los valores de la matriz
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        // 4.- Imprimir
        System.out.println("matriz de enteros indices 0 0 = " + edades[0][0]);
        System.out.println("matriz de enteros indices 0 1 = " + edades[0][1]);
        System.out.println("matriz de enteros indices 1 0 = " + edades[1][0]);
        System.out.println("matriz de enteros indices 1 1 = " + edades[1][1]);
        System.out.println("matriz de enteros indices 2 0 = " + edades[2][0]);
        System.out.println("matriz de enteros indices 2 1 = " + edades[2][1]);


        // 1.- Decarar e instaciar una matriz de tipo persona
        Persona personas[][] = new Persona[1][2];

        // 2.- Inicializar valores
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Maria");
        
        // 3.- Imprimir
        System.out.println("Matriz personas indice 0 0 = " + personas[0][0]);
        System.out.println("Matriz personas indice 0 1 = " + personas[0][1]);

        System.out.println();
        System.out.println("   Matriz Edades");
        for (int i=0; i<edades.length;i++){
            for (int j=0; j<edades[i].length;j++){
                System.out.println("Matriz Edades indice "+ i + " - " + j + " : " + edades[i][j]);
            }
        }

        System.out.println("   Matriz Personas");
        for (int m=0; m<personas.length;m++){
            for (int n=0; n<personas[m].length;n++){
                System.out.println("Matriz personas indice "+ m + " - " + n + " : " + personas[m][n]);
            }
        }

        String nombres [][] = {{"Teresa","Cesar","Willian"},{"Jose","Katty","sebas"}};
        System.out.println("   Matriz Nombres");
        for (int m=0; m<nombres.length;m++){
            for (int n=0; n<nombres[m].length;n++){
                System.out.println("Matriz nombres indice "+ m + " - " + n + " : " + nombres[m][n]);
            }
        }
    }
}
