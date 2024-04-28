import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer[] st = new StringTokenizer[T];
        for (int i = 0; i < T; i++) {
            st[i] = new StringTokenizer(br.readLine());
        }
        for (int i = 0; i < T; i++) {
            int A = Integer.parseInt(st[i].nextToken());
            int B = Integer.parseInt(st[i].nextToken());
            System.out.print("Case #" + (i+1) + ": " + A + " + " + B + " = ");
            
            System.out.println(A + B);
        }

    }
}
