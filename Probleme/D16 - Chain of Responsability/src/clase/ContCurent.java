package clase;

public class ContCurent extends ContBancar{

    public ContCurent(String iban, double sold) {
        super(iban, sold);
    }

    @Override
    public ContBancar getNextContBancar() {
        return super.getNextContBancar();
    }

    @Override
    public void setNextContBancar(ContBancar nextContBancar) {
        super.setNextContBancar(nextContBancar);
    }

    @Override
    public double getSold() {
        return super.getSold();
    }

    @Override
    public void setSold(double sold) {
        super.setSold(sold);
    }



}
