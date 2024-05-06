package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends ANode {
    private String denumire;
    private List<ANode> listaComponente;

    public Sectiune(String denumire) {
        super();
        this.denumire = denumire;
        this.listaComponente = new ArrayList<>();
    }

    @Override
    public void addNode(ANode node) {
      this.listaComponente.add(node);
    }

    @Override
    public void stergeNode(ANode node) {
        this.listaComponente.remove(node);
    }

    @Override
    public ANode getNode(int i) {
        return this.listaComponente.get(i);
    }

    @Override
    public String getNume() {
        return this.denumire;
    }

    @Override
    public double getPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNrProduse() {
        int nrProduse = 0;
        for(ANode produs : listaComponente){
            nrProduse += produs.getNrProduse();
        }
        return nrProduse;
    }
}
