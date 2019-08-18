package LaboratorioFinal.MundoPC;

public class Raton {

    private int idRaton;
    private static int contadorRatones;
    private DispositivoEntrada dispositivosEntradas;

    /*
    public Raton() {

        this.idRaton = ++contadorRatones;
    } */

    public Raton(String tipoEntrada, String marca) {

        this.idRaton = ++contadorRatones;

        this.dispositivosEntradas = new DispositivoEntrada(tipoEntrada, marca);

    }

    @Override
    public String toString() {
        return "{" +
                "idRaton=" + idRaton +
                ", " + dispositivosEntradas +
                '}';
    }
}
