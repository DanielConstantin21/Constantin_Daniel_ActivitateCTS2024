package clase;

public class PlataCash implements IModPlata {
    @Override
    public void setModPlata(NotaPlata nota) {
        System.out.printf("Masa %d plateste cash suma de %.2f.\n",nota.getNumarMasa(),nota.getSuma());
    }
}
