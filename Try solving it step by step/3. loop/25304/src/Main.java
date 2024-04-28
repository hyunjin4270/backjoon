import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long maxMoney = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());
            maxMoney -= money*number;
        }

        if (maxMoney == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
    
}
