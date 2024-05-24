package clase;

public class CameraGarda extends IInternare {
    @Override
    boolean isStareInternare(Pacient pacient) {
        if(pacient.isStareInternare()){
            return true;
        }
        return false;
    }

    @Override
    boolean isDisponibilPat(ANode salon) {
        if(salon.isLiber()){
            return true;
        }
        return false;
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("S-a emis fisa pacientului " + pacient.getNume());
    }


}
