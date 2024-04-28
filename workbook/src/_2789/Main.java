package _2789;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sentence = new StringBuilder(br.readLine());
        final String CAMBRIDGE = "CAMBRIDGE";
        for (int i = 0; i < CAMBRIDGE.length(); i++) {
            sentence = new StringBuilder(sentence.toString().replace(String.valueOf(CAMBRIDGE.charAt(i)), ""));
        }
        System.out.println(sentence.toString());
    }
}
