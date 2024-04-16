import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] cups = new boolean[]{true, false, false};
        
        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < number; i++) {
            String[] strChange = scanner.nextLine().split(" ");
            int[] intChange = new int[2];
            for (int j = 0; j < intChange.length; j++) {
                intChange[j] = Integer.parseInt(strChange[j]);
                intChange[j]--;
            }

            if (cups[intChange[0]] || cups[intChange[1]]) {
                cups[intChange[0]] = !cups[intChange[0]];
                cups[intChange[1]] = !cups[intChange[1]];
            }
        }

        for (int i = 0; i < cups.length; i++) {
            if (cups[i]) {
                System.out.println(i + 1);
            }
        }
        
    }
    
}
