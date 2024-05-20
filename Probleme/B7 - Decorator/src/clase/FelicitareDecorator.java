package clase;

public class FelicitareDecorator extends DecoratorNota {

    public FelicitareDecorator(ANotaPlata nota) {
        super(nota);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("La Multi Ani!");
    }
}
