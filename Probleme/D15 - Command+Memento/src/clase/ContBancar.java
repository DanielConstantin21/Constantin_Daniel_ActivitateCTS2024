package clase;

public class ContBancar {
   private String iban;
   private double sold;
    ManagerOperatiuni managerOperatiuni = new ManagerOperatiuni();
    public void constituire(String iban){
        managerOperatiuni.adaugaVersiune(new VersiuneContBancar(this.iban, this.sold));
        System.out.println("S-a constituit contul.");
        this.iban = iban;
        this.sold = 0;
    }
    public void depunere(double suma){
        if(iban != null) {
            managerOperatiuni.adaugaVersiune(new VersiuneContBancar(this.iban,this.sold));
            this.sold += suma;
            System.out.println("S-a depus suma de " + suma);
        }else{
            throw new UnsupportedOperationException("Contul nu a fost constituit!");
        }
    }
    public void retragere(double suma){
        if(iban !=null){
            if(suma < this.sold){
                managerOperatiuni.adaugaVersiune(new VersiuneContBancar(this.iban, this.sold));
                this.sold -= suma;
                System.out.println("S-a retras suma de "+ suma);
            }else{
                throw new UnsupportedOperationException("Nu sunt fonduri suficiente!");
            }

        }else{
            throw new UnsupportedOperationException("Contul nu a fost constituit!");
        }
    }
    public void undo(){
        System.out.println("Undo!");
        VersiuneContBancar temp = managerOperatiuni.recuperareVersiune();
        this.sold = temp.getSold();
        this.iban = temp.getIban();
    }
    public void showSold() {
        System.out.println("Soldul contului "+this.iban+" este de "+this.sold);
    }

}
