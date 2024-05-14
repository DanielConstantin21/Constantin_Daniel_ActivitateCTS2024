package clase;

public class Depunere implements IOperatiune{
   private ContBancar cont;
   private double suma;

    public Depunere(ContBancar cont, double suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void opereaza() {
        this.cont.depunere(this.suma);
    }
}
