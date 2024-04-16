import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequence;
        int input = scanner.nextInt();
        scanner.nextLine();
        sequence = new int[input];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = scanner.nextInt();
            scanner.nextLine();
        }
        if (sequence[0] - sequence[1] == sequence[1] - sequence[2]) {
            System.out.println(sequence[sequence.length - 1] + (sequence[1] - sequence[0]));
        } else {
            System.out.println(sequence[sequence.length - 1] * (sequence[1] / sequence[0]));
        }
    }
}
