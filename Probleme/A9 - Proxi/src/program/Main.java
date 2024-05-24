package program;

import clase.IInternare;
import clase.Pacient;
import clase.Spital;
import clase.SpitalProxy;

public class Main {
    public static void main(String[] args) {
        IInternare spital = new Spital("Sf. Pantelimon");
        Pacient pacient1 = new Pacient("Gigel", true);
        Pacient pacient2 = new Pacient("Costel", true);
        Pacient pacient3 = new Pacient("Ionel", false);

        //
        IInternare spitalProxy = new SpitalProxy(spital);
        spitalProxy.interneaza(pacient2);
        spitalProxy.interneaza(pacient3);
        spitalProxy.interneaza(pacient1);


    }
}
