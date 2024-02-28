package classes;

public class Pacient {
    private long id;
    private String nume;

    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuci;
    private boolean hasHalat;

    public long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public boolean hasPatRabatabil() {
        return hasPatRabatabil;
    }

    public boolean hasMicDejunInclus() {
        return hasMicDejunInclus;
    }

    public boolean hasPapuci() {
        return hasPapuci;
    }

    public boolean hasHalat() {
        return hasHalat;
    }
    private Pacient (PacientBuilder builder){
        this.id = builder.id;
        this.nume = builder.nume;
        this.hasPatRabatabil = builder.hasPatRabatabil;
        this.hasMicDejunInclus = builder.hasMicDejunInclus;
        this.hasHalat = builder.hasHalat;
        this.hasPapuci = builder.hasPapuci;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", hasPatRabatabil=" + hasPatRabatabil +
                ", hasMicDejunInclus=" + hasMicDejunInclus +
                ", hasPapuci=" + hasPapuci +
                ", hasHalat=" + hasHalat +
                '}';
    }

    public static class PacientBuilder{
        private long id;
        private String nume;

        private boolean hasPatRabatabil;
        private boolean hasMicDejunInclus;
        private boolean hasPapuci;
        private boolean hasHalat;
        public PacientBuilder(long id, String nume){
            this.id = id;
            this.nume = nume;
        }
        public PacientBuilder hasPatRabatabil(boolean hasPatRabatabil){
            this.hasPatRabatabil = hasPatRabatabil;
            return this;
        }
        public PacientBuilder hasMicDejunInclus(boolean hasMicDejunInclus){
            this.hasMicDejunInclus = hasMicDejunInclus;
            return this;
        }
        public PacientBuilder hasHalat(boolean hasHalat){
            this.hasHalat = hasHalat;
            return this;
        }
        public PacientBuilder hasPapuci( boolean hasPapuci){
            this.hasPatRabatabil = hasPapuci;
            return this;
        }

        public Pacient build(){
            return new Pacient(this);
        }
    }
}
