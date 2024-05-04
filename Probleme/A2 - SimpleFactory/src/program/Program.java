package program;

import clase.PersonalFactory;
import clase.PersonalSpital;
import clase.TipPersonal;

public class Program {
    public static void main(String[] args) {
        PersonalSpital brancardier = PersonalFactory.creazaPersonal("Gigel", TipPersonal.BRANCARDIER);
        PersonalSpital asistent = PersonalFactory.creazaPersonal("Vasilica", TipPersonal.ASISTENT);
        PersonalSpital medic = PersonalFactory.creazaPersonal("Toto", TipPersonal.MEDIC);

    }
}
