package clase;

public class NotificareManager extends ANotificare{

    @Override
    public void notifica(Client client) {
            System.out.println("Managerul este notificat, nu exista date pentru clientul "+client.getNume());
    }
}
