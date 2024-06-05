package _3035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = new String[4];
        for (int i = 0; i < 4; i++) {
            test[i] = br.readLine();
        }
        System.out.println(Arrays.toString(test));
    }

}
