package _3004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(cutWidthAndHeight(scanner.nextInt()));
    }
    static int cutWidthAndHeight(int numberOfCuts) {
        int Width = (numberOfCuts / 2) + 1;
        int Height = Width + (numberOfCuts % 2);
        return Width * Height;

    }
}
