import classes.Pacient;

public class Program {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient.PacientBuilder(1,"Gica cu optiuni")
                .hasMicDejunInclus(true)
                .hasHalat(true)
                .build();
        System.out.println(pacient1.toString());
        Pacient pacient2 = new Pacient.PacientBuilder(2,"Gogu fara optiuni")
                .build();
        System.out.println(pacient2.toString());
    }
}
