package _1546;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        double average = 0;
        int T = Integer.parseInt(br.readLine());

        int[] scores = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            average += scores[i] * 100;
            max = Math.max(max, scores[i]);
        }
        System.out.println(average / (T * max));
    }
}
