import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector strings = new Vector<>();
        while (true) {
            Str str = new Str(scanner.nextLine());
            if (str.STRING.equals("#")) {
                break;
            }
            strings.add(str);
            
        }
        for (int i = 0; i < strings.size(); i++) {
            int count = 0;
            String str =((Str) strings.get(i)).getSTRING().toLowerCase();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
                
            }
            System.out.println(count);
        }
    }
    static class Str {
        final private String STRING;
        Str(String STRING) {
            this.STRING = STRING;
        }
        public String getSTRING() {
            return STRING;
        }
    }
    
}
