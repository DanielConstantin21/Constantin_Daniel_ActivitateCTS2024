package clase;

public class Produs extends ANode{
    public String nume;
    public double pret;

    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public int getNrProduse() {
        return 1;
    }

    @Override
    public void addNode(ANode node) {
        System.out.println("Un produs nu poate contine sectiuni.");
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNode(ANode node) {
        System.out.println("Stergerea nu se poate aplica pt un produs.");
        throw new UnsupportedOperationException();
    }

    @Override
    public ANode getNode(int i) {
        throw new UnsupportedOperationException();
    }
}
