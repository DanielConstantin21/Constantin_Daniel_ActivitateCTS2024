package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Oana", "039848282","oanababana@nothing.ro");
        Client client2 = new Client("Andreea", null,"oanababana@nothing.ro");
        Client client3 = new Client("Maria", null,null);

        ANotificare notificareSms = new NotificareSms();
        ANotificare notificareEmail = new NotificareEmail();
        ANotificare notificareManager = new NotificareManager();

        notificareSms.setNextHandler(notificareEmail);
        notificareEmail.setNextHandler(notificareManager);

        notificareSms.notifica(client2);
        notificareSms.notifica(client1);
        notificareSms.notifica(client3);

    }
}
