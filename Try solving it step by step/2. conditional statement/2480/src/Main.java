import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();
        if (dice1 == dice2 && dice1 == dice3) {
            System.out.println(dice1 * 1000 + 10000);
        } else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
            if (dice1 == dice2 || dice1 == dice3) {
                System.out.println(dice1 * 100 + 1000);
            } else {
                System.out.println(dice2 * 100 + 1000);
            }
        } else {
            System.out.println(Math.max(dice1, Math.max(dice2, dice3)) * 100);
        }
    }
}
