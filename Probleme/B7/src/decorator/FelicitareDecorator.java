package decorator;

public class FelicitareDecorator extends ADecoratorNota {

    public FelicitareDecorator(ANotaPlata nota) {
        super(nota);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("La Multi Ani!");
    }
}
