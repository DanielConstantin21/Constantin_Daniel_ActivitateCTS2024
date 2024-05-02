package clase;

public class Medic extends PersonalSpital {


    Medic(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Medicul:" + nume +", varsta: "+varsta );
    }


}
