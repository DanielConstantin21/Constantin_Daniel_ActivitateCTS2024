package clase;

public abstract class ANotificare {
    private ANotificare nextHandler;
    private ANotificare lastHandler;
    public void setNextHandler(ANotificare nextHandler){
        this.nextHandler = nextHandler;
    }
    public ANotificare getNextHandler(){
        return this.nextHandler;
    }

    public ANotificare getLastHandler() {
        return lastHandler;
    }

    public void setLastHandler(ANotificare lastHandler) {
        this.lastHandler = lastHandler;
    }

    public abstract void notifica(Client client);

}
