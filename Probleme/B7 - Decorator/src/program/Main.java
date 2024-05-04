package program;

import clase.ANotaPlata;
import clase.FelicitareDecorator;
import clase.NotaPlata;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nota simpla");
        ANotaPlata nota = new NotaPlata(110,22);
        nota.print();

        System.out.println("Nota cu Felicitare");
        ANotaPlata notaFelicitare = new FelicitareDecorator(new NotaPlata(120,24));
        notaFelicitare.print();
    }
}
