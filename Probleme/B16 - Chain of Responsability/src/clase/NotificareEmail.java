package clase;

public class NotificareEmail extends ANotificare{

    @Override
    public void notifica(Client client) {
        if(client.getEmail() != null){
            System.out.println("Clientul "+client.getNume()+" este notificat prin email.");
        }else if(getNextHandler() !=null){
            getNextHandler().notifica(client);
        }else{

        }
    }
}
