package clase;

import java.util.HashMap;

public class ClientFlyweightFactory {
    private static HashMap<Long, Client> listaClienti = new HashMap<>();
    private static int nrReteteProcesate=0;
    public static Client getClient(long nrAsigurare, String nume){
        nrReteteProcesate++;
        Client client = listaClienti.get(nrAsigurare);
        if(client == null){
            client = new Client(nrAsigurare, nume);
            listaClienti.put(client.getNrAsigurare(), client);
        }
        return client;
    }

    public static void getNrReteteProcesate() {
        System.out.println("Numar retete procesate="+nrReteteProcesate);
    }
    public static void getNrClienti(){
        System.out.println("Numar de clienti in memorie="+listaClienti.size());
    }
}
