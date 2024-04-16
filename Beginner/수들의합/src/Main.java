import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        int Number = 0;
        scanner.nextLine();
        for (int i = 1; i > 0; i++) {
            if (input < i) {
                Number = (i - 1);
                break;
            }
            input -= i;
            
        }
        System.out.println(Number);
        
    }
    
}
