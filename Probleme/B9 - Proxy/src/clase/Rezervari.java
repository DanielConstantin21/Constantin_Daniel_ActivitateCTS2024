package clase;

import java.util.LinkedList;

public class Rezervari implements IRezervare{
    private LinkedList<Rezervare> listaRezervari =  new LinkedList<>();


    @Override
    public void adaugaRezervare(Rezervare rezervare) {
        this.listaRezervari.add(rezervare);
        System.out.println("Rezervare efectuata pe numele "+rezervare.getNume() +" pentru "+rezervare.getNrPersoane()+" persoane");
    }
}
