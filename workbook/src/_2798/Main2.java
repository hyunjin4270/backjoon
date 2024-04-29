package _2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] card = new int[Integer.parseInt(st.nextToken())]; //카드 개수
        int limit = Integer.parseInt(st.nextToken()); //수 리미트 지정
        int maxScore = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < card.length; i++) { // 카드 정수변수 안에 숫자 집어넣기
            card[i] = Integer.parseInt(st.nextToken());
        }

        //모든 경우의수 구하기
        for (int i = 0, score; i < (card.length - 2); i++) { //첫번째 카드 지정
            for (int j = (i + 1); j < (card.length - 1); j++) { //두번째 카드 지정
                for (int k = (j + 1); k < card.length; k++) { //세번째 카드 지정
                    if (card[i] + card[j] + card[k] <= limit) {
                        score = card[i] + card[j] + card[k];
                        maxScore = Math.max(maxScore, score);
                    }
                }
            }
        }
        System.out.println(maxScore);
    }


}
