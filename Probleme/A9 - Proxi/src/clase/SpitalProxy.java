package clase;

public class SpitalProxy implements IInternare {
    private IInternare spital;

    public SpitalProxy(IInternare spital) {
        this.spital = spital;
    }

    @Override
    public void interneaza(Pacient pacient) {
        if(pacient.isAsigurat()){
            this.spital.interneaza(pacient);
        }else{
            System.out.println("Pacientul "+pacient.getNume()+" nu poate fi internat pt ca nu are asigurare.");
        }
    }
}
