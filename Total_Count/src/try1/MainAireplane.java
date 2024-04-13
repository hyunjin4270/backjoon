package try1;

import java.util.Scanner;

public class MainAireplane {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            AirplaneTotalScore.comparePlaneCount(scanner.nextLine());
        }
        
    }
    
}