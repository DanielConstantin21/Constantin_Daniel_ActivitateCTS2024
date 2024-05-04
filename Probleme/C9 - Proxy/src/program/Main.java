package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
       Produs p1 = new Produs("Crema Fata", 45.8, ETipProdus.COSMETIC);
       Produs p2 = new Produs("Ceai Catina", 12.4, ETipProdus.SUPLIMENT_ALIMENTAR);
       Produs p3 = new Produs("Aspirina", 15.8, ETipProdus.MEDICAMENT);

       IVanzare vanzare = new Vanzare(false);

       IVanzare vanzareProxy = new VanzareProxy(vanzare);
       vanzareProxy.adaugaProdus(p1);
       vanzareProxy.adaugaProdus(p2);
       vanzareProxy.adaugaProdus(p3);

       vanzareProxy.totalPlata();
    }
}
