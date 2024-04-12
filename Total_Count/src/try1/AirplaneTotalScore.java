package try1;

import java.util.Vector;

public class AirplaneTotalScore {
    private Vector planeCount = new Vector();

    public void comparePlaneCount(String airplane) {
        if (planeCount.size() == 0) {
            planeCount.add(new Airplane(airplane));
            return;
        }

        for (int i = 0; i < planeCount.size(); i++) {
            Airplane compareAirplane = (Airplane) planeCount.get(i);
            if (compareAirplane.airplaneName.equals(airplane)) {
                planeCount.add(new Airplane(airplane));
            }
        }
    }



    class Airplane extends Object {
        final String airplaneName;
        int killScore = 0;

        Airplane(String airplaneName) {
            this.airplaneName = airplaneName;
            pluskillScore();
        }
        void pluskillScore() {
            this.killScore++;
        }
    }
}
