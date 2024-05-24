package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        ANode salon = new Salon(1);
        ANode pat1 = new Pat(1, false);
        ANode pat2 = new Pat(1, false);
        ANode pat3 = new Pat(1, true);

        salon.adauga(pat1);
        salon.adauga(pat2);
        salon.adauga(pat3);
        Pacient pacient = new Pacient("Gogu", false);
        CameraGarda cameraGarda = new CameraGarda();
        cameraGarda.internare(pacient, salon);
    }
}
