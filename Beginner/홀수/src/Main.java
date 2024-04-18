
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int intNumber = 0;
        int min = 100;
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            if (0 != (intNumber = Integer.parseInt(br.readLine())) % 2) {
                sum += intNumber;
                min = Math.min(intNumber, min);
            }
        }
        if (sum != 0) {
            System.out.printf("%d\n%d", sum, min);
        } else {
            System.out.println("-1");
        }
        
    }
    
}
