import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String input;
        Vector bat = new Vector<>();
        Alphabat[] biggest = new Alphabat[26];
        char[] sortChar = new char[26];

        while ((input = br.readLine()) != null) {
            str += input;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
                
            } else {
                int count = 0;
                for (int j = 0; j < bat.size(); j++) {
                    Alphabat alphabat = (Alphabat) bat.get(j);
                    if (alphabat.alphabat == ch) {
                        alphabat.plus();
                        bat.remove(j);
                        bat.add(alphabat);                        
                        break;
                    } else {
                        count++;
                    }
                }
                if (count == bat.size()) {
                    Alphabat alphabat = new Alphabat(ch);
                    bat.add(alphabat);
                    
                }
            }
            
            
        }

        biggest[0] = (Alphabat) bat.get(0);
        int count = 0;
        for (int i = 0; i < bat.size(); i++) {
            Alphabat word1 = (Alphabat) bat.get(i);
            if (word1.save > biggest[0].save) {
                count = 0;
                Arrays.fill(biggest, null);
                biggest[count++] = (Alphabat) bat.get(i);
            } else if (word1.save == biggest[0].save) {
                biggest[count++] = (Alphabat) bat.get(i);
            } else {
                continue;
            }
        }
        try {
            
            for (int i = 0; i < biggest.length; i++) {
                sortChar[i] = biggest[i].alphabat;
            }
        } catch (NullPointerException e) {
            Arrays.sort(sortChar);
            for (int i = 0; i < sortChar.length; i++) {
                System.out.print(sortChar[i]);
            }
        }
    }

    static class Alphabat {
        private final char alphabat;
        private int save = 1;
        void plus() {
            save++;    
        }
        Alphabat(char alphabat) {
            this.alphabat = alphabat;
        }
    }
    
}
