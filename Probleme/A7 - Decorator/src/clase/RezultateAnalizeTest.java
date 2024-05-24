package clase;

public class RezultateAnalizeTest extends DecoratorRezultateAnalize{

    public RezultateAnalizeTest(IRezultateAnalize rezultate) {
        super(rezultate);
    }


    @Override
    public void getRezultatAnalize() {
        rezultate.getRezultatAnalize();
        System.out.println("Rezultatele analizelor publicate online.");
    }
}
