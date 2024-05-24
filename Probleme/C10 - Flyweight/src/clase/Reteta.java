package clase;

public class Reteta implements IReteta{
    private Client client;
    private int nrReteta;
    private int nrMedicamente;
    private double sumaPlata;
    public Reteta(Client client, int nrReteta, int nrMedicamente, double sumaPlata) {
        this.client = client;
        this.nrReteta = nrReteta;
        this.nrMedicamente = nrMedicamente;
        this.sumaPlata = sumaPlata;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                 client.toString() +
                ", nrReteta=" + nrReteta +
                ", nrMedicamente=" + nrMedicamente +
                ", sumaPlata=" + sumaPlata +
                '}';
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public int getNrReteta() {
        return nrReteta;
    }

    @Override
    public int getNrMedicamente() {
        return nrMedicamente;
    }

    @Override
    public double getSumaPlata() {
        return sumaPlata;
    }
}
