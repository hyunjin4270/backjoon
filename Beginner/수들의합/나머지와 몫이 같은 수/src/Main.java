import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long result = 0;

        for (int i = 1; i < input; i++) {
            result += (long) input * i + i;
        }
        System.out.println(result);
    }
    
}
