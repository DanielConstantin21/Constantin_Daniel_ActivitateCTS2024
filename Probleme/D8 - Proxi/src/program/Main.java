package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        //credit vechi
        ICredit credit = new Credit();
        credit.setContCredit(EMoneda.EUR);

        //credit nou
        ICredit creditNou = new CreditProxi(credit);
        creditNou.setContCredit(EMoneda.RON);

    }
}

