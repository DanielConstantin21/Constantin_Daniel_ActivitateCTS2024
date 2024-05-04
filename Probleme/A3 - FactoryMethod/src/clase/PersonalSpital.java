package clase;

public abstract class PersonalSpital {
    String nume;
    int varsta;

    public PersonalSpital(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public abstract void afiseazaDetalii();
}
