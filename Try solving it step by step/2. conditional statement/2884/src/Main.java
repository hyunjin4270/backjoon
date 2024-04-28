import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        if ((min - 45) >= 0) {
            System.out.println(hour + " " + (min - 45));
        } else {
            if ((hour - 1) >= 0) {
                System.out.println((hour - 1) + " " + (min + 15));
            } else {
                System.out.println((hour + 23) + " " + (min + 15));
            }
        }
    }
    
}
