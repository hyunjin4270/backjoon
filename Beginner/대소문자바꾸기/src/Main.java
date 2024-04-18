import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String renewalStr = "";
        char[] ch = new char[1];
        for (int i = 0; i < str.length(); i++) {
            if (65 <= (ch[0] = str.charAt(i)) && ch[0] <= 90) {
                renewalStr += new String(ch).toLowerCase();
            } else if (97 <= (ch[0] = str.charAt(i)) && ch[0] <= 122) {
                renewalStr += new String(ch).toUpperCase();
            } else {
                renewalStr += " ";
            }
        } 
        System.out.println(renewalStr);
    }
}
