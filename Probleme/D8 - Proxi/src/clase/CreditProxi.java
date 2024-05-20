package clase;

public class CreditProxi implements ICredit{
    private ICredit credit;

    public CreditProxi(ICredit credit) {
        this.credit = credit;
    }
    @Override
    public void setContCredit(EMoneda moneda) {
        if(moneda.equals(EMoneda.RON)){
            this.credit.setContCredit(moneda);
        }else{
            System.out.println("Sunt permise doar conturile in RON");
        }
    }

    @Override
    public Cont getContCredit() {
        return null;
    }
}
