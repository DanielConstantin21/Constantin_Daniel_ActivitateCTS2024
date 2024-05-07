package clase;

public class Factura {
    private int nrMasa;
    private double sumaPlata;

    public Factura(int nrMasa, double sumaPlata) {
        this.nrMasa = nrMasa;
        this.sumaPlata = sumaPlata;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public double getSumaPlata() {
        return sumaPlata;
    }
}
