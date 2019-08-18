package LaboratorioFinal.MundoPC;

public class Monitor {

    private int idMonitor;
    private static int contadorMonitores;
    private String Marca;
    private double tamaño;


    public Monitor() {

        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamaño) {
        this();
        Marca = marca;
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }


    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "{" +
                "idMonitor=" + idMonitor +
                ", Marca='" + Marca + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }
}
