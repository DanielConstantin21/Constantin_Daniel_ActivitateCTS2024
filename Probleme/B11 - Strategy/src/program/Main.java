package program;

import clase.NotaPlata;
import clase.PlataCard;
import clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        NotaPlata nota1 = new NotaPlata(3,340);
        nota1.setModPlata(new PlataCard());
        nota1.plateste();

        NotaPlata nota2 = new NotaPlata(12, 180);
        nota2.setModPlata(new PlataCash());
        nota2.plateste();

    }
}
