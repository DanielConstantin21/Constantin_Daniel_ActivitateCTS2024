package clase;

import java.util.ArrayList;
import java.util.List;

public class Vanzare implements IVanzare{
    private List<Produs> listaProduse;
    private boolean hasReteta = false;

    public Vanzare(boolean hasReteta) {
        this.listaProduse= new ArrayList<>();
        this.hasReteta = hasReteta;
    }

    public List<Produs> getListaProduse() {
        return listaProduse;
    }

    public boolean hasReteta() {
        return hasReteta;
    }

    public void setHasReteta(boolean hasReteta) {
        this.hasReteta = hasReteta;
    }

    @Override
    public void adaugaProdus(Produs produs) {
        listaProduse.add(produs);
    }

    @Override
    public void totalPlata() {
       double total = this.listaProduse.stream().mapToDouble(d->d.getPret()).reduce(0,Double::sum);
        System.out.printf("Total plata %.2f",total);


    }
}
