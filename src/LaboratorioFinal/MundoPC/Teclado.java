package LaboratorioFinal.MundoPC;

public class Teclado {

    private int idTeclado;
    private static int contadorTeclados;
    private DispositivoEntrada dispositivosEntradas;

    public Teclado() {

        this.idTeclado = ++contadorTeclados;
    }

    public Teclado(String tipoEntrada, String marca) {

        this.idTeclado = ++contadorTeclados;
        this.dispositivosEntradas = new DispositivoEntrada(tipoEntrada, marca);
    }

    @Override
    public String toString() {
        return "{" +
                "idTeclado=" + idTeclado +
                ", " + dispositivosEntradas +
                '}';
    }
}
