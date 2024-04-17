import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
            sum += numbers[i];
            
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1 + i; j < numbers.length; j++) {
                if(i != j && (numbers[i] + numbers[j]) == (sum - 100)) {
                    numbers[i] = 0;
                    numbers[j] = 0;
                    Arrays.sort(numbers);
                    for (int j2 = 2; j2 < 9; j2++) {
                        System.out.println(numbers[j2]);
                    }
                    return;
                }
            }
        }

    }
}
