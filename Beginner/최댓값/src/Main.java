import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int max = 0;
        for (int i = 1; i <= 9; i++) {
            String input;
            max = Math.max(Integer.parseInt(input = br.readLine()), max);
            if (max == Integer.parseInt(input)) {
                count = i;
            }
            
        }
        System.out.println(max + "\n" + count);
    }
    
}
