package _14582;

import java.io.*;
import java.util.StringTokenizer;

public class Main2 {
    static final int NUMBER_OF_MATCHES = 9;
    static String reversal = null;
    static String scoreAdvantage = "Due";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Team zeminis = new Team("Zeminis", br.readLine());
        Team startlink = new Team("Startlink", br.readLine());

        for (int i = 0; i < NUMBER_OF_MATCHES; i++) {
            Next(zeminis, startlink, i);
            Next(startlink, zeminis, i);
        }
        if (reversal == null ||
                reversal.equals("Zeminis") ||
                scoreAdvantage.equals("Due")) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }

    static void Next(Team attackTeam, Team defenseTeam, int inning) {
        attackTeam.totalScore += attackTeam.score[inning];
        if (attackTeam.totalScore < defenseTeam.totalScore) {
            return;
        }
        if (attackTeam.totalScore == defenseTeam.totalScore) {
            scoreAdvantage = "Due";
            reversal = null;
            return;
        }
        if (scoreAdvantage.equals("Due") || scoreAdvantage.equals(attackTeam.teamName)) {
            scoreAdvantage = attackTeam.teamName;
            return;
        }
        reversal = attackTeam.teamName;
    }
    static class Team {
        String teamName;
        int[] score = new int[NUMBER_OF_MATCHES];
        int totalScore;
        public Team(String teamName, String score) {
            this.teamName = teamName;
            StringTokenizer st = new StringTokenizer(score);
            for (int i = 0; i < NUMBER_OF_MATCHES; i++) {
                this.score[i] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
