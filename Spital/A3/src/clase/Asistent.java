package clase;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, int varsta) {
       super(nume,varsta);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Asistentul:" + nume +", varsta: "+varsta );
    }
}
