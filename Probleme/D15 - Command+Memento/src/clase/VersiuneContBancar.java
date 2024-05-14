package clase;

public class VersiuneContBancar {
    String iban;
    double sold;

    public VersiuneContBancar(String iban, double sold) {
        super();
        this.iban = iban;
        this.sold = sold;
    }

    public String getIban() {
        return iban;
    }

    public double getSold() {
        return sold;
    }
}
