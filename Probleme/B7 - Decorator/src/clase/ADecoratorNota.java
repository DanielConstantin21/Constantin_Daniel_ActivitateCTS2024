package clase;

public class ADecoratorNota extends ANotaPlata{
    ANotaPlata nota;

   public ADecoratorNota(ANotaPlata nota){
       super(nota.totalConsumat, nota.tips);
       this.nota = nota;
   }

    @Override
    public void print() {
        nota.print();
    }
}
