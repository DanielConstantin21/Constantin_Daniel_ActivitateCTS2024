package clase;

public abstract class ContBancar {
    private final String iban;
    private double sold;

   private ContBancar nextContBancar;

    public ContBancar(String iban, double sold) {
        this.iban = iban;
        this.sold = sold;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public ContBancar getNextContBancar() {
        return nextContBancar;
    }

    public void setNextContBancar(ContBancar nextContBancar) {
        this.nextContBancar = nextContBancar;
    }
     void proceseazaPlata(double sumaPlata) {
        if(this.getSold()>=sumaPlata){
            System.out.println("Plata efectuata din "+this.getClass().getSimpleName());
            this.setSold(this.getSold()-sumaPlata);
        } else{
            if(this.getNextContBancar() !=null) {
                this.getNextContBancar().proceseazaPlata(sumaPlata);
            }else{
                System.out.println("Plata nu poate fi efectuata, nici un cont nu are suma solicitata");
            }
        }
    }

}
