package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        ContBancar cont = new ContBancar();
        IOperatiune constituire = new Constituire(cont,"RO2345XX00");
        IOperatiune depunere1 = new Depunere(cont,1000);
        IOperatiune retragere1 = new Retragere(cont, 300);
        IOperatiune depunere2 = new Depunere(cont,2000);
        IOperatiune retragere2 = new Retragere(cont, 600);

        Operator operator = new Operator();
        operator.introducereComanda(constituire);
        operator.introducereComanda(depunere1);
        cont.showSold();

        operator.introducereComanda(retragere1);
        cont.showSold();
        cont.undo();
        operator.introducereComanda(retragere2);
        operator.introducereComanda(depunere2);
        cont.undo();
        cont.showSold();
    }
}
