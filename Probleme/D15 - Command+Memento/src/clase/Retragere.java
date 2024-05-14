package clase;

public class Retragere implements IOperatiune{
   private ContBancar cont;
   private double suma;

    public Retragere(ContBancar cont, double suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void opereaza() {
        this.cont.retragere(this.suma);
    }
}
