package clase;

public class Pacient {
    private String nume;
    private boolean isAsigurat;

    public Pacient(String nume, boolean isAsigurat) {
        this.nume = nume;
        this.isAsigurat = isAsigurat;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAsigurat() {
        return isAsigurat;
    }
}
