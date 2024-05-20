package clase;

public class Credit implements ICredit{
    private Cont contCredit;
    private String tipCredit;


    @Override
    public void setContCredit(EMoneda moneda) {
       contCredit = new Cont(moneda);
        System.out.println("Cont "+moneda.name() +" setat.");
    }

    @Override
    public Cont getContCredit() {
        return null;
    }


}
