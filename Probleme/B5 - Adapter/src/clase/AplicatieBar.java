package clase;

public class AplicatieBar implements IPrintFacturaBar{
    @Override
    public void printareFacturaBar(Factura factura) {
        System.out.println("Printare Factura Aplicatie Bar total= "+factura.getSumaPlata());
    }
}
