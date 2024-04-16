package try1;

import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String twoNumber = scanner.nextLine();
        String[] twoNumbers = twoNumber.split(" ");
        int[] Numbers = new int[2];
        for (int i = 0; i < twoNumbers.length; i++) {
            Numbers[i] = Integer.parseInt(twoNumbers[i]);
        }
        double dev = (double) Numbers[0] / Numbers[1];
        System.out.println(dev);
    }
    
}
