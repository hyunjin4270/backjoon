package _2789;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        final String CAMBRIDGE = "CAMBRIDGE";
        for (int i = 0; i < CAMBRIDGE.length(); i++) {
            sentence = sentence.replace(Character.toString(CAMBRIDGE.charAt(i)), "");
        }
        System.out.println(sentence);
    }
}
