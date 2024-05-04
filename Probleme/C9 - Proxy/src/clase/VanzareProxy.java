package clase;

import java.util.List;

public class VanzareProxy implements IVanzare{
    IVanzare vanzare;

    public VanzareProxy(IVanzare vanzare) {
        super();
        this.vanzare = vanzare;
    }

    @Override
    public void adaugaProdus(Produs produs) {
        if(produs.getTip()==ETipProdus.MEDICAMENT && vanzare.hasReteta()==false){
            System.out.println("Produsul "+ produs.getNume() +" nu poate fi adaugat. Medicamentele nu pot fi achizitionate fara reteta!");
        }else{
            vanzare.adaugaProdus(produs);
            System.out.println("Produsul "+ produs.getNume()+" a fost adaugat.");
        }
    }

    @Override
    public void totalPlata() {
        vanzare.totalPlata();
    }

    @Override
    public List<Produs> getListaProduse() {
        return vanzare.getListaProduse();
    }

    @Override
    public boolean hasReteta() {
        return vanzare.hasReteta();
    }
}
