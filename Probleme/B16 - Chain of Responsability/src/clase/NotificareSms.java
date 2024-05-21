package clase;

public class NotificareSms extends ANotificare{
    @Override
    public void notifica(Client client) {
        if(client.getNrTelefon() != null){
            System.out.println("Clientul "+client.getNume()+" este notificat prin SMS.");
        }else if(getNextHandler() !=null){
            getNextHandler().notifica(client);
        }else{
            System.out.println("Managerul este notificat, nu exista date pentru clientul "+client.getNume());
        }
    }
}
