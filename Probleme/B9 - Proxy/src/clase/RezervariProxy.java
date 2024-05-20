package clase;

public class RezervariProxy implements IRezervare {
    IRezervare rezervari;

    public RezervariProxy(IRezervare rezervari) {
        this.rezervari = rezervari;
    }

    @Override
    public void adaugaRezervare(Rezervare rezervare) {
        if (rezervare.getNrPersoane() >= 4) {
            this.rezervari.adaugaRezervare(rezervare);
        } else {
            System.out.println("Nu se pot face rezervari pentru mai putin de 4 persoane.");
        }
    }
}
