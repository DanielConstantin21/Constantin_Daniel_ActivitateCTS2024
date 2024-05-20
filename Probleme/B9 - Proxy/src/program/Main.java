package program;

import clase.IRezervare;
import clase.Rezervare;
import clase.Rezervari;
import clase.RezervariProxy;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervariVechi = new Rezervari();
        Rezervare rezervare1 = new Rezervare(6, "Gogu");
        Rezervare rezervare2 = new Rezervare(2, "Costel");
        Rezervare rezervare3 = new Rezervare(4, "Camelia");
        rezervariVechi.adaugaRezervare(rezervare1);

        //rezervari conditionate
        IRezervare rezervariNoi = new RezervariProxy(rezervariVechi);
        rezervariNoi.adaugaRezervare(rezervare2);
        rezervariNoi.adaugaRezervare(rezervare3);
    }
}
