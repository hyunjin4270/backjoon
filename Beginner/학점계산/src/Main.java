import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allGrade = br.readLine();
        char grade = allGrade.charAt(0);
        if (grade == 'F') {
            System.out.println("0.0");
            return;
        }
        double score = 69 - grade;
        if (allGrade.charAt(1) == '+') {
            score = score + 0.3;
        } else if (allGrade.charAt(1) == '-'){
            score = score - 0.3;
        }
        System.out.println(score);
    }
    
}
