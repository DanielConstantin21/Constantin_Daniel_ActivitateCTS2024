package clase;

public class Rezervare {
    private final int nrPersoane;
    private final String nume;

    public Rezervare(int nrPersoane, String nume) {
        this.nrPersoane = nrPersoane;
        this.nume = nume;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getNume() {
        return nume;
    }
}
