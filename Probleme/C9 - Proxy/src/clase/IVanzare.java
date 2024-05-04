package clase;

import java.util.List;

public interface IVanzare{
    void adaugaProdus(Produs produs);
    void totalPlata();
    List<Produs> getListaProduse();
    boolean hasReteta();
}
