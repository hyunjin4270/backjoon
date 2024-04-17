import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        
        String a = "1 2";
        String[] twoNumbers =a.split(" ");
        int[] numbers = new int[]{Integer.parseInt(twoNumbers[0]), Integer.parseInt(twoNumbers[1])};
        int sum = 0;
        for (int i = numbers[0], j = 0; i <= (numbers[1] - numbers[0]) / 2; i++,j++) {
            sum += i + (numbers[1] - j);
        }
        System.out.println(sum);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
    }
    
}
