package clase;

public abstract class IInternare {
    abstract boolean isStareInternare(Pacient pacient);
    abstract boolean isDisponibilPat(ANode salon);
    abstract void emitereFisa(Pacient pacient);

    public void internare(Pacient pacient, ANode salon){
        if(isStareInternare(pacient) && salon.isLiber()){
            emitereFisa(pacient);
        }else{
            System.out.println("Pacientul nu poate fi internat");
        }
    }
}
