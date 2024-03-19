package clase;

public class Asistent extends PersonalSpital{
    TipPersonal tip;

    public Asistent(String nume, TipPersonal tip) {
        super(nume);
        this.tip = tip;
        System.out.println("a fost creat "+nume +" " +tip.toString());
    }
}
