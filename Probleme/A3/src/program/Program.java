package program;

import clase.*;

public class Program {
    public static void main(String[] args) {
        IFactory factoryBrancardier = new FactoryBrancardier();
        IFactory factoryMedic = new FactoryMedic();
        IFactory factoryAsistent = new FactoryAsistent();
        PersonalSpital medic = factoryMedic.adaugaPersonal("Georgescu", 42);
        PersonalSpital asistent = factoryAsistent.adaugaPersonal("Marinescu", 24);
        PersonalSpital brancardier = factoryBrancardier.adaugaPersonal("Gita", 20);

        medic.afiseazaDetalii();
        asistent.afiseazaDetalii();
        brancardier.afiseazaDetalii();

    }
}
