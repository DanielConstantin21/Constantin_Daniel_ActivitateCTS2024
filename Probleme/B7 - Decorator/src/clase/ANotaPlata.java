package clase;

public abstract class ANotaPlata {
    protected double totalConsumat;
    protected double tips;

    public ANotaPlata(double totalConsumat, double tips) {
        this.totalConsumat = totalConsumat;
        this.tips = tips;
    }

    public abstract void print();
}
