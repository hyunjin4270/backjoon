import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] numbers = br.readLine().split(" ");
            int[] intNumber = new int[2];
            for (int i = 0; i < numbers.length; i++) {
                intNumber[i] = Integer.parseInt(numbers[i]);
            }

            System.out.println(Math.abs((long)intNumber[0] - intNumber[1]));


            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    } 
    
}
