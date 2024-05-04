package clase;

public class PersonalFactory {
    public static PersonalSpital creazaPersonal(String nume, TipPersonal tip){
        switch(tip){
            case BRANCARDIER: return new Brancardier(nume, tip);
            case ASISTENT: return new Asistent(nume,tip);
            case MEDIC: return new Medic(nume,tip);
            default:  throw new IllegalArgumentException("Tipul de personal spital invalid: " + tip);
        }
    }
}
