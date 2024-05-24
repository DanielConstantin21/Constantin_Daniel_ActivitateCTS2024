package clase;

import java.util.ArrayList;

public class Salon extends ANode {
    private int nr;
    private ArrayList<ANode> listaCopii;

    public Salon(int nr) {
        this.nr = nr;
        listaCopii = new ArrayList<>();
    }

    @Override
    public int getNumar() {
        return this.nr;
    }

    @Override
    public boolean isLiber() {
        if(listaCopii != null && listaCopii.size()>0)
        for(ANode copil : listaCopii){
            if(copil.isLiber())
                return true;
        }
        return false;
    }

    @Override
    public void adauga(ANode copil) {
        this.listaCopii.add(copil);
    }

    @Override
    public void sterge(ANode copil) {
        this.listaCopii.remove(copil);
    }
}
