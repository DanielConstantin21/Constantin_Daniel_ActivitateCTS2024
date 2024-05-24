package clase;

public abstract class DecoratorRezultateAnalize implements IRezultateAnalize{
    IRezultateAnalize rezultate;

    public DecoratorRezultateAnalize(IRezultateAnalize rezultate) {
        this.rezultate = rezultate;
    }

    private IRezultateAnalize rezultateAnalize;

}
