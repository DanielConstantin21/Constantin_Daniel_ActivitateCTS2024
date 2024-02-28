import classes.PersonalFactory;
import classes.PersonalSpital;
import classes.TipPersonal;

public class Program {
    public static void main(String[] args) {
        PersonalSpital brancardier = PersonalFactory.creazaPersonal("Gigel", TipPersonal.BRANCARDIER);
        PersonalSpital asistent = PersonalFactory.creazaPersonal("Vasilica", TipPersonal.ASISTENT);
        PersonalSpital medic = PersonalFactory.creazaPersonal("Toto", TipPersonal.MEDIC);

    }
}
