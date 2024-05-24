package program;

import clase.IRezultateAnalize;
import clase.RezultateAnalize;
import clase.RezultateAnalizeTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Forma initiala");
        IRezultateAnalize rezultate = new RezultateAnalize();
        rezultate.getRezultatAnalize();

        System.out.println("Test printat si online");
        IRezultateAnalize rezultateTest = new RezultateAnalizeTest(rezultate);
        rezultateTest.getRezultatAnalize();

        System.out.println("Revenire forma initiala");
        rezultate.getRezultatAnalize();
    }
}
