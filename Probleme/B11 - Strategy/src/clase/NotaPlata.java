package clase;

public class NotaPlata {
    private final int numarMasa;
    private final double suma;
    private IModPlata modPlata;

    public NotaPlata(int numarMasa, double suma) {
        this.numarMasa = numarMasa;
        this.suma = suma;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public double getSuma() {
        return suma;
    }

    public void plateste(){
        if(modPlata != null){
            modPlata.setModPlata(this);
        }else{
            throw new UnsupportedOperationException("Nu este setata o modalitate de plata");
        }
    }
}
