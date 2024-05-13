package clase;

public class CardBancar{
    private final String titular;
    private ContCurent contCurent;
    private ContEconomii contEconomii;
    private ContUrgente contUrgente;

    public CardBancar(String titular, ContCurent contCurent, ContEconomii contEconomii, ContUrgente contUrgente) {
        this.titular = titular;
        this.contCurent = contCurent;
        this.contEconomii = contEconomii;
        this.contUrgente = contUrgente;
    }


    public void plateste(double sumaPlata) {
        this.contCurent.proceseazaPlata(sumaPlata);
    }
    public void printSoldCard(){
        System.out.println("Sold cont curent = "+contCurent.getSold());
        System.out.println("Sold cont economii = "+contEconomii.getSold());
        System.out.println("Sold cont urgente = "+contUrgente.getSold());
        System.out.println("Sold total = "+(contEconomii.getSold()+ contCurent.getSold()+ contUrgente.getSold()));
    }

    public ContCurent getContCurent() {
        return contCurent;
    }

    public ContEconomii getContEconomii() {
        return contEconomii;
    }

    public ContUrgente getContUrgente() {
        return contUrgente;
    }
}
