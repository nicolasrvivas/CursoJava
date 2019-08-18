package LaboratorioFinal.MundoPC;

public class Orden {

    private int idOrden;
    private static int contadorOrdenes;
    private Computadora computadoras[];
    private int contadorComputadoras;
    private static final int maxComputadoras=15;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[maxComputadoras];
    }

    public void agregarComputadoras(Computadora computadora){
        if (contadorComputadoras < maxComputadoras) {
            // Agregamos el nuevo producto al arreglo
            // e incrementamos  el contador de producto
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println(" Se ha superado el maximo de computadoras = " + maxComputadoras);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i=0; i < contadorComputadoras; i++){
            total += computadoras[i].getPrecio();  // e lo mismo que total = total + productos[i].getPrecio;
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("idOrden = " + idOrden);
        System.out.println("Total en la orden = " + calcularTotal());
        System.out.println("Computadoras en la orden = ");
        for (int i = 0 ; i < contadorComputadoras; i++){
            System.out.println(computadoras[i]);
        }
    }
}
