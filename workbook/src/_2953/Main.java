package _2953;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    final static int JUDGE = 4;
    final static int CHEF = 5;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Chef[] chefs = new Chef[5];
        for (int i = 0; i < CHEF; i++) {
            chefs[i] = new Chef(i + 1, br.readLine());
        }
        Chef winner = getWinner(chefs);
        System.out.println(winner);
    }

    //Chef 병렬클래스중 score가 가장 높은 클래스를 반환하는 메서드
    public static Chef getWinner(Chef[] chefs) {
        Chef winner = chefs[0];
        for (int i = 1; i < CHEF; i++) {
            if (winner.getScore() < chefs[i].getScore()) {
                winner = chefs[i];
            }
        }
        return winner;
    }

    //입력받은 점수를 총합해서 저장해주는 요리사 클래스
    static class Chef {
        private int number;
        private int score;
        Chef(int number,String score) {
            StringTokenizer st = new StringTokenizer(score);
            this.number = number;
            for (int i = 0; i < JUDGE; i++) {
                this.score += Integer.parseInt(st.nextToken());
            }
        }
        public int getScore() {
            return score;
        }
        @Override
        public String toString() {
            return number + " " + score;
        }
    }
}