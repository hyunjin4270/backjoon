package _14582;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer zeminisScore = new StringTokenizer(br.readLine());
        StringTokenizer startlinkScore = new StringTokenizer(br.readLine());
        int numberOfMatch = 1;
        int zeminisTotalScore = 0;
        int startlinkTotalScore = 0;
        boolean isReversal = false;
        String scoreAdvantage = "Zeminis";

        while (numberOfMatch++ <= 9) {
            zeminisTotalScore += Integer.parseInt(zeminisScore.nextToken());
            if (zeminisTotalScore > startlinkTotalScore &&
                    scoreAdvantage.equals("Startlink")) {
                isReversal = false;
                scoreAdvantage = "Zeminis";
            } else if (zeminisTotalScore > startlinkTotalScore) {
                scoreAdvantage = "Zeminis";
            } else if (zeminisTotalScore == startlinkTotalScore) {
                scoreAdvantage = "Due";
            }

            startlinkTotalScore += Integer.parseInt(startlinkScore.nextToken());
            if (zeminisTotalScore < startlinkTotalScore &&
                    scoreAdvantage.equals("Zeminis")) {
                isReversal = true;
                scoreAdvantage = "Startlink";
            } else if (zeminisTotalScore < startlinkTotalScore) {
                scoreAdvantage = "Startlink";
            } else if (zeminisTotalScore == startlinkTotalScore) {
                scoreAdvantage = "Due";
            }

        }

        if (isReversal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
