import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector number = new Vector<>();
        
        while (true) {
            Str str = new Str(scanner.nextLine());
            
            if (str.NUMBER.equals("0")) {
                break;
            }
            number.add(str);
        }

        for (int i = 0; i < number.size(); i++) {
            Str str = (Str) number.get(i);
            boolean system = true;
            for (int j = 0; j < str.NUMBER.length()/2; j++) {    
                char start = str.NUMBER.charAt(j);
                char end = str.NUMBER.charAt(str.NUMBER.length()- j - 1);
                if (start != end) {
                    system = false;
                }
                
                
            }
            if (system) {
                System.out.println("yes");
            } else {
                System.out.println("no");
                system = true;
            }
        }

    }

    static class Str {
        final String NUMBER;

        Str(String NUMBER) {
            this.NUMBER = NUMBER;
        }

    }
    
}
