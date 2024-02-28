package classes;

public class Medic extends PersonalSpital{
    TipPersonal tip;

    public Medic(String nume, TipPersonal tip) {
        super(nume);
        this.tip = tip;
        System.out.println("a fost creat "+nume +" " +tip.toString());
    }
}
