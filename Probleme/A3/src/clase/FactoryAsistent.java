package clase;

public class FactoryAsistent implements IFactory {
    @Override
    public PersonalSpital adaugaPersonal(String nume, int varsta) {
        return new Asistent(nume,varsta);
    }
}
