package clase;

public class ContUrgente extends ContBancar{
    public ContUrgente(String iban, double sold) {
        super(iban, sold);
    }

    @Override
    public double getSold() {
        return super.getSold();
    }

    @Override
    public void setSold(double sold) {
        super.setSold(sold);
    }

    @Override
    public ContBancar getNextContBancar() {
        return super.getNextContBancar();
    }

    @Override
    public void setNextContBancar(ContBancar nextContBancar) {
        super.setNextContBancar(nextContBancar);
    }


}
