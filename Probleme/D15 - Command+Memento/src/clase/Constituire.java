package clase;

public class Constituire implements IOperatiune{
  private  ContBancar cont;
  private  String iban;

    public Constituire(ContBancar cont, String iban) {
        this.cont = cont;
        this.iban = iban;
    }

    @Override
    public void opereaza() {
        this.cont.constituire(this.iban);
    }
}
