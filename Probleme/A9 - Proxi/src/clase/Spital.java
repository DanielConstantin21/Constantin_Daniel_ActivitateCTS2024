package clase;

public class Spital implements IInternare{
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("A fost internat Pacientul "+pacient.getNume());
    }
}
