package clase;

import java.util.Objects;

public class Spectator implements IDeseneaza {
    private ECuloareTricou culoareTricou;
    private EDimensiune inaltime;
    private EDimensiune latime;

    public Spectator(ECuloareTricou culoareTricou, EDimensiune inaltime, EDimensiune latime) {
        this.culoareTricou = culoareTricou;
        this.inaltime = inaltime;
        this.latime = latime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(culoareTricou,inaltime,latime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Spectator spectator= (Spectator) o;

        if (!inaltime.equals(spectator.inaltime) || !latime.equals(spectator.latime)
                || !culoareTricou.equals(spectator.culoareTricou) ) return false;

        return true;
    }

    @Override
    public void deseneaza(Persoana persoana) {
        System.out.println("S-a desenat spectatorul "+persoana.toString() +", "+this);
    }

    @Override
    public String toString() {
        return
                "culoareTricou=" + culoareTricou.toString() +
                ", inaltime=" + inaltime.toString() +
                ", latime=" + latime.toString() +
                '}';
    }
}
