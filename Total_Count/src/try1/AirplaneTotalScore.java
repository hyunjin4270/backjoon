package try1;

import java.util.Vector;

public class AirplaneTotalScore {
    private AirplaneTotalScore() {}
    @SuppressWarnings("rawtypes")
    private static Vector planeCount = new Vector();

    
    @SuppressWarnings("unchecked")
    public static void comparePlaneCount(String airplane) {
        if (airplane.equals("0")) {
            getTotalScore();
        }

        if (planeCount.size() == 0) {
            planeCount.add(new Airplane(airplane));
            return;
        }

        for (int i = 0, count = 0; i < planeCount.size(); i++) {
            Airplane compareAirplane = (Airplane) planeCount.get(i);

            if (compareAirplane.AIRPLANE_NAME.equals(airplane)) {
                planeCount.remove(i);
                compareAirplane.pluskillScore();
                planeCount.add(compareAirplane);
                return;
                
            } else {
                count++;
            }

            if (count == planeCount.size()) {
                planeCount.add(new Airplane(airplane));
                return;
            }
        }
    }

    public static void getTotalScore() {
        int totalScore = 0;
        for (int i = 0; i < planeCount.size(); i++) {
            Airplane printAirplane = (Airplane) planeCount.get(i);
            System.out.println(printAirplane.getAIRPLANE_NAME() + ": " + printAirplane.getKillScore());
            totalScore += printAirplane.getKillScore();
        }
        System.out.println("Grand Total: " + totalScore);
        System.exit(0);
    }


    private static class Airplane {
        private final String AIRPLANE_NAME;
        private int killScore = 1;

        Airplane(String AIRPLANE_NAME) {
            this.AIRPLANE_NAME = AIRPLANE_NAME;
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
