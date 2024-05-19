package clase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SpectatorFactory {
    private static Map<Integer, Spectator> listaTipuriSpectatori = new HashMap<>();
    private static int nrSpectatoriDesenati=0;

    public static Spectator getTipuriSpectatori(ECuloareTricou tricou, EDimensiune inaltime, EDimensiune latime) {
        nrSpectatoriDesenati++;
        int hashSpectator = Objects.hash(tricou,inaltime,latime);
        Spectator spectator = listaTipuriSpectatori.get(hashSpectator);
        if(spectator==null) {
            spectator = new Spectator(tricou,inaltime,latime);
            listaTipuriSpectatori.put(spectator.hashCode(), spectator);
        }
        return spectator;
    }

    public static void getNrSpectatori() {
        System.out.println("Nr de spectatori este de "+nrSpectatoriDesenati);
    }

    public static void getNrTipuriSpectatori(){
        System.out.println("Nr de tipuri spectatori este de "+listaTipuriSpectatori.size());
    }
}
