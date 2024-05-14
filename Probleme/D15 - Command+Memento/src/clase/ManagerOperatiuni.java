package clase;

import java.util.ArrayList;

public class ManagerOperatiuni {
    private ArrayList<VersiuneContBancar> istoricCont = new ArrayList<>();

    public void adaugaVersiune(VersiuneContBancar versiuneCont){
        this.istoricCont.add(versiuneCont);
    }

    public VersiuneContBancar recuperareVersiune(){
        VersiuneContBancar cont = istoricCont.get(istoricCont.size()-1);
        istoricCont.remove(istoricCont.size()-1);
        return cont;
    }
}



