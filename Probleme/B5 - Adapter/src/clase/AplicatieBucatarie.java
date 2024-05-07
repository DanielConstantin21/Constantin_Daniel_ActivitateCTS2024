package clase;

public class AplicatieBucatarie implements IPrintFacturaBucatarie {

    @Override
    public void printareFacturaBucatarie(int nrMasa, double totalPlata) {
        System.out.println("Printare Factura Aplicatie Bucatarie, total ="+totalPlata);
    }
}
