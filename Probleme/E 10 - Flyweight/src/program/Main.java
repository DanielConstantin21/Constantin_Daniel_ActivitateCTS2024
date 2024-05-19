package program;

import clase.ECuloareTricou;
import clase.EDimensiune;
import clase.Persoana;
import clase.SpectatorFactory;

public class Main {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana('A',10, 45);
        SpectatorFactory.getTipuriSpectatori(ECuloareTricou.ROSU, EDimensiune.SMALL, EDimensiune.MEDIUM).deseneaza(persoana1);
        Persoana persoana2 = new Persoana('C',20, 13);
        SpectatorFactory.getTipuriSpectatori(ECuloareTricou.ROSU, EDimensiune.SMALL, EDimensiune.MEDIUM).deseneaza(persoana2);
        Persoana persoana3  = new Persoana('B',13, 43);
        SpectatorFactory.getTipuriSpectatori(ECuloareTricou.VERDE, EDimensiune.LARGE, EDimensiune.MEDIUM).deseneaza(persoana3);
        Persoana persoana4  = new Persoana('B',20, 44);
        SpectatorFactory.getTipuriSpectatori(ECuloareTricou.VERDE, EDimensiune.LARGE, EDimensiune.MEDIUM).deseneaza(persoana4);
        SpectatorFactory.getNrSpectatori();
        SpectatorFactory.getNrTipuriSpectatori();
    }
}
