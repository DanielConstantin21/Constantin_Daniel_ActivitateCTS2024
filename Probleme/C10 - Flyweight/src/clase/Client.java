package clase;

public class Client{
    private long nrAsigurare;
    private String nume;

    public Client(long nrAsigurare, String nume) {
        this.nrAsigurare = nrAsigurare;
        this.nume = nume;
    }

    public long getNrAsigurare() {
        return nrAsigurare;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nrAsigurare=" + nrAsigurare +
                ", nume='" + nume + '\'' +
                '}';
    }
}
