package clase;

public class PlataCard implements IModPlata{

    @Override
    public void setModPlata(NotaPlata nota) {
        System.out.printf("Masa %d plateste cu cardul suma de %.2f.\n",nota.getNumarMasa(),nota.getSuma());
    }
}
