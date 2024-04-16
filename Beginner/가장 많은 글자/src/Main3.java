import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabat = new int[26];
        String str = "";
        String input;
        int max = -1;

        while ((input = br.readLine()) != null) {
            str += input;
        }

        Arrays.fill(alphabat, 0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                alphabat[str.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < alphabat.length; i++) {
            if (alphabat[i] > max) {
                max = alphabat[i];
            }
        }
        for (int i = 0; i < alphabat.length; i++) {
            if (alphabat[i] == max) {
                System.out.print((char)('a' + i));
            }
        }


    }
    
}
