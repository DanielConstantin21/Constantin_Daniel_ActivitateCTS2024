package clase;

public class Brancardier extends PersonalSpital{


     Brancardier(String nume, int varsta) {
        super(nume,varsta);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Brancardierul:" + nume +", varsta: "+varsta );
    }
}
