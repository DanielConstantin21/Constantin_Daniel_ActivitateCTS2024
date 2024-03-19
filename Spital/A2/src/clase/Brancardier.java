package clase;

public class Brancardier extends PersonalSpital{
    TipPersonal tip;

    public Brancardier(String nume, TipPersonal tip) {
        super(nume);
        this.tip = tip;
        System.out.println("a fost creat "+nume +" " +tip.toString());
    }
}
