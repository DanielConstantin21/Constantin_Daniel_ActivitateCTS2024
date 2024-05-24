package clase;

public class Pat extends ANode{
    private int nr;
    private boolean isLiber;

    public Pat(int nr, boolean isLiber) {
        this.nr = nr;
        this.isLiber = isLiber;
    }

    public void setLiber(boolean liber) {
        isLiber = liber;
    }

    @Override
    public int getNumar() {
        return this.nr;
    }

    @Override
    public boolean isLiber() {
       return this.isLiber;
    }

    @Override
    public void adauga(ANode copil) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sterge(ANode copil) {
        throw new UnsupportedOperationException();
    }
}
