package clase;

public class Pacient {
    private String nume;
    private boolean isStareInternare;

    public Pacient(String nume, boolean isStareInternare) {
        this.nume = nume;
        this.isStareInternare = isStareInternare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isStareInternare() {
        return isStareInternare;
    }
}
