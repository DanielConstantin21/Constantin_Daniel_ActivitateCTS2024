package clase;

public class FactoryBrancardier implements IFactory{

    @Override
    public PersonalSpital adaugaPersonal(String nume, int varsta) {
        return new Brancardier(nume,varsta);
    }
}
