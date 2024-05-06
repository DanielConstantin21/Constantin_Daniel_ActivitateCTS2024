package clase;

public class Meniu {
    private String numeRestaurant;
    private Sectiune sectiune;

    public Meniu(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public Sectiune getSectiune() {
        return sectiune;
    }

    public void setSectiune(Sectiune sectiune) {
        this.sectiune = sectiune;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }
}
