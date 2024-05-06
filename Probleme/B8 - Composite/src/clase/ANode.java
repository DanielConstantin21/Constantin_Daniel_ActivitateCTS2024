package clase;

public abstract class ANode {

    public abstract String getNume();
    public abstract double getPret();
    public abstract int getNrProduse();

    public void addNode(ANode node){
        throw new UnsupportedOperationException();
    }
    public void stergeNode(ANode node){
        throw new UnsupportedOperationException();
    }
    public ANode getNode(int i){
        throw new UnsupportedOperationException();
    }
}
