package try1;

import java.util.Vector;

public class AirplaneTotalScore {
    private AirplaneTotalScore() {}
    private static Vector planeCount = new Vector();

    
    public static void comparePlaneCount(String airplane) {
        if (planeCount.size() == 0) {
            planeCount.add(new Airplane(airplane));
            return;
        }

        for (int i = 0, count = 0; i < planeCount.size(); i++) {
            Airplane compareAirplane = (Airplane) planeCount.get(i);

            if (compareAirplane.AIRPLANE_NAME.equals(airplane)) {
                Airplane airplane2 = (Airplane) planeCount.get(i);
                planeCount.remove(i);
                airplane2.pluskillScore();
                planeCount.add(airplane2);
            } else {
                count++;
            }

            if (count == planeCount.size()) {
                planeCount.add(new Airplane(airplane));
            }
        }
    }

    public static void getTotalScore() {
        for (int i = 0; i < planeCount.size(); i++) {
            Airplane printAirplane = (Airplane) planeCount.get(i);
            System.out.println();

        }
    }


    private static class Airplane {
        private final String AIRPLANE_NAME;
        private int killScore = 0;

        Airplane(String AIRPLANE_NAME) {
            this.AIRPLANE_NAME = AIRPLANE_NAME;
            pluskillScore();
        }
        
        private void pluskillScore() {
            this.killScore++;
        }

        public String getAIRPLANE_NAME() {
            return AIRPLANE_NAME;
        }
        public int getKillScore() {
            return killScore;
        }

    }
}
