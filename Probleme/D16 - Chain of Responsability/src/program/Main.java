package program;

import clase.CardBancar;
import clase.ContCurent;
import clase.ContEconomii;
import clase.ContUrgente;

public class Main {
    public static void main(String[] args) {
        CardBancar card = new CardBancar("Georgescu",new ContCurent("xmcm23455222",120)
                ,new ContEconomii("dsw232495959",200), new ContUrgente("xsds33234222422",600));

        card.getContCurent().setNextContBancar(card.getContEconomii());
        card.getContEconomii().setNextContBancar(card.getContUrgente());

        card.plateste(240);
        card.printSoldCard();
    }
}
