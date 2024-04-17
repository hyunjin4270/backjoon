import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vector strings = new Vector<>();
        String input;

        boolean system = true;
        while (system) {
            input = br.readLine();
            if (input.equals("#")) {
                break;
            } else {
                strings.add(input);
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            int count = 0;
            String output = (String) strings.get(i);
            String[] string = output.toLowerCase().split(" ", 2);
            char word = string[0].charAt(0);
            for (int j = 0; j < string[1].length(); j++) {
                if (word == string[1].charAt(j)) {
                    count++;
                }
            }
            System.out.println(word + " " + count);
        }
        
    }
    
}
