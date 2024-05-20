package clase;

public class DecoratorNota extends ANotaPlata{
    ANotaPlata nota;

   public DecoratorNota(ANotaPlata nota){
       super(nota.totalConsumat, nota.tips);
       this.nota = nota;
   }

    @Override
    public void print() {
        nota.print();
    }
}
