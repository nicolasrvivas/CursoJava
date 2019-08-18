package ArregloEjemplo;

public class EjemploArreglo {
    public static void main(String[] args) {
        // 1.- Declarracion Arreglo tipo int
        int edades[];

        // 2.- Instanciar edades
        edades = new int[3];

        // 3.- Inicializar valores

        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        // 4.- Imprimir valores a la salida estandar
        // se lee cada valor del arreglo
        System.out.println("edades posicion [0] = " + edades[0]);
        System.out.println("edades posicion [1] = " + edades[1]);
        System.out.println("edades posicion [2] = " + edades[2]);

        //    Arreglos de objetos
        // 1.- Declarar Arreglo
        Persona personas[];

        // 2.- Instanciar el arreglo de tipo objeto
        personas = new Persona[4];

        // 3-. Inicializar los valores del arreglo
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Pedro");
        
        // Imprimir los valores del arreglo
        System.out.println("Arreglo personas indice 0 = " + personas[0]);
        System.out.println("Arreglo personas indice 1 = " + personas[1]);
        System.out.println("Arreglo personas indice 2 = " + personas[2]);
        System.out.println("Arreglo personas indice 3 = " + personas[3]);

        String nombres[] = {"Sara", "Laura", "Juan", "Carlos"};
        for (int i=0;i< nombres.length -1; i++){
            System.out.println("Arreglo String nombres, indice i = " + i+" valor = "+nombres[i]);
        }

    }
}
