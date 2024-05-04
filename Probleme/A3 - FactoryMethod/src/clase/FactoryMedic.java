package clase;

public class FactoryMedic implements IFactory{

    @Override
    public PersonalSpital adaugaPersonal(String nume, int varsta) {
        return new Medic(nume, varsta);
    }
}
