import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strNumbers = br.readLine().split(" ");
        int[] intNumbers = new int[5];
        int sum = 0;
        for (int i = 0; i < intNumbers.length; i++) {
            intNumbers[i] = Integer.parseInt(strNumbers[i]);
        }

        for (int i = 0; i < intNumbers.length; i++) {
            sum += Math.pow(intNumbers[i], 2);
        }
        System.out.println(sum % 10);

    }
}
