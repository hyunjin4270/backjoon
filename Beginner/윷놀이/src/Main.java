import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strYut = "";
        String input;
        while ((input = br.readLine()) != null) { //EOF
            strYut += input + "\n";
        }

        String[] lineBreaking = strYut.split("\n");
        for (int i = 0; i < lineBreaking.length; i++) {
            StringTokenizer sTokenizer = new StringTokenizer(lineBreaking[i], " ");
            int count = 0;
            for (int j = 0; sTokenizer.hasMoreTokens(); j++) {
                if (sTokenizer.nextToken().equals("0")) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println('E');
            } else {
                System.out.println((char)('A' + count - 1));
            } 
        }
    }
    
}
