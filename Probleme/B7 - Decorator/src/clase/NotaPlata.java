package clase;

public class NotaPlata extends ANotaPlata{

    public NotaPlata(double totalConsumat, double tips) {
        super(totalConsumat, tips);
    }

    @Override
    public void print() {
        System.out.println("Total Plata: "+ (this.totalConsumat + this.tips));
    }

}
