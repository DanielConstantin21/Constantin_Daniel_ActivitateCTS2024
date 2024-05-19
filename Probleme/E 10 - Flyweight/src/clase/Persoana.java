package clase;

public class Persoana {

   private char sector;
   private int rand;
   private int loc;

    public Persoana(char sector, int rand, int loc) {
        this.sector = sector;
        this.rand = rand;
        this.loc = loc;
    }

    public char getSector() {
        return sector;
    }

    public int getRand() {
        return rand;
    }

    public int getLoc() {
        return loc;
    }

    @Override
    public String toString() {
        return  "sector=" + sector +
                ", rand=" + rand +
                ", loc=" + loc;
    }
}
