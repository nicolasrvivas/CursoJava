package ClaseDiseño.GMVentas;

public class Orden {

    private int idOrden;
    private static int contadorOrdenes;
    private Producto productos[];
    private int contadoProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProductos(Producto producto){

        // Si los productos agregados no superan el maximo de productos
        // el nuevo producto al arreglo
        if (contadoProductos < MAX_PRODUCTOS) {
            // Agregamos el nuevo producto al arreglo
            // e incrementamos  el contador de productos
            productos[contadoProductos++] = producto;
        } else {
            System.out.println(" Se ha superado el maximo de productos = " + MAX_PRODUCTOS);
        }

    }

    public double calcularTotal(){
        double total = 0;
        for (int i=0; i < contadoProductos; i++){
            total += productos[i].getPrecio();  // e lo mismo que total = total + productos[i].getPrecio;
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("idOrden = " + idOrden);
        System.out.println("Total en la orden = " + calcularTotal());
        System.out.println("Productos en la orden = ");
        for (int i = 0 ; i < contadoProductos; i++){
            System.out.println(productos[i]);
        }
    }

}
