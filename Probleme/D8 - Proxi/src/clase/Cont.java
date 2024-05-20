package clase;

public class Cont {
    private EMoneda moneda;
    private double sold;

    public Cont(EMoneda moneda) {
        this.moneda = moneda;
    }

    public void depunere(double suma){
        sold += suma;
    }
    public void retragere(double suma){
        if(sold > suma){
            sold -=suma;
        }else{
            throw new UnsupportedOperationException("Fonduri insuficiente");
        }
    }

    public EMoneda getMoneda() {
        return moneda;
    }
}
