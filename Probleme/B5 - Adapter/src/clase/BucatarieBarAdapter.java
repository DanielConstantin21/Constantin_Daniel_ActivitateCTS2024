package clase;

public class BucatarieBarAdapter extends AplicatieBar implements IPrintFacturaBucatarie{
    @Override
    public void printareFacturaBucatarie(int nrMasa, double totalPlata) {
        this.printareFacturaBar(new Factura(nrMasa,totalPlata));
    }
}
