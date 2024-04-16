import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int bird = scanner.nextInt();
        scanner.nextLine();

        while (bird != 0) {
            for (int song = 1; song <= bird; song++) {
                bird -= song;
                count++;
            }
        }
        System.out.println(count);
    }
}
