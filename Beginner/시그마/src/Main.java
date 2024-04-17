import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        long number1 = Long.parseLong(stringTokenizer.nextToken());
        long number2 = Long.parseLong(stringTokenizer.nextToken());
        long max = Math.max(number1, number2);
        long min = Math.min(number1, number2);
        long sum = (min + max) * ((max - min + 1) / 2);
        if (((max - min + 1) % 2) != 0) {
            sum += (max + min) / 2;
        }
        System.out.println(sum);
    }
    
}
