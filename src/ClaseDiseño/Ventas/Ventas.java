package ClaseDiseño.Ventas;

import ClaseDiseño.GMVentas.*;

public class Ventas {

    public static void main(String[] args) {
        // creamos varios objetos de tipo productos
        Producto producto1 = new Producto("camisa", 50);
        Producto producto2 = new Producto("pantalon", 100);

        // Creamos un objeto de tipo orden
        Orden orden1 = new Orden();

        // Agregamos productos a esta orden
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);

        // imprimir orden
        orden1.mostrarOrden();
    }

}
