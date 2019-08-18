package LaboratorioFinal.VentaMundoPC;

import LaboratorioFinal.MundoPC.*;

public class MundoPC {

    public static void main(String[] args) {

        // creamos varios objetos de tipo Computradora
        //Computadora(String nombre, String monitor, String raton, String teclado, double precio)

        Monitor monitor1 = new Monitor("HP",14.5);
        Raton raton1 = new Raton("Optico", "HP");
        Teclado teclado1 = new Teclado("Optico", "HP");
        Computadora computadora1 = new Computadora("LK10", monitor1, raton1,teclado1,1000);

        Monitor monitor2 = new Monitor("IBM",19.5);
        Raton raton2 = new Raton("Optico", "HP");
        Teclado teclado2 = new Teclado("Analogico", "IBM");
        Computadora computadora2 = new Computadora("LK10", monitor2, raton2,teclado2,500);

        // Creamos un objeto de tipo orden
        Orden orden1 = new Orden();


        // Agregamos productos a esta orden
        orden1.agregarComputadoras(computadora1);
        orden1.agregarComputadoras(computadora2);

        // imprimir orden
        orden1.mostrarOrden();

    }

}
