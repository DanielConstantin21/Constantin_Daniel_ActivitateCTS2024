package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura(2, 210);
        IPrintFacturaBar facturaBar = new AplicatieBar();
        facturaBar.printareFacturaBar(factura);

        IPrintFacturaBucatarie notaBucatarie = new BucatarieBarAdapter();
        notaBucatarie.printareFacturaBucatarie(3, 140);
    }
}
