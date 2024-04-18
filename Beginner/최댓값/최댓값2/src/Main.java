import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = 0;
        int collumn = 0;
        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer Numbers = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                max = Math.max(index = Integer.parseInt(Numbers.nextToken()), max);
                if (max == index) {
                    row = (i + 1);
                    collumn = (j + 1);
                }   
                
            }
        }
        System.out.println(max + "\n" + row + " " + collumn);

    }
}