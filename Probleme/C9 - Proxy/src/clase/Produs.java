package clase;

public class Produs {
    private String nume;
    private double pret;
    private ETipProdus tip;


    public Produs(String nume, double pret, ETipProdus tip) {
        this.nume = nume;
        this.pret = pret;
        this.tip = tip;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public ETipProdus getTip() {
        return tip;
    }

    public void setTip(ETipProdus tip) {
        this.tip = tip;
    }
}
