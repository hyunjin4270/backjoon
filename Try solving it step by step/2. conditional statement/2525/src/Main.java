import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int ovenMin = scanner.nextInt();
        if ((hour + ((ovenMin + min) / 60)) >= 24) {
            System.out.print(((((ovenMin + min) / 60) + hour) - 24) + " ");
        } else {
            System.out.print(((((ovenMin + min) / 60) + hour)) + " ");
            
        }
        if ((min + (ovenMin % 60)) >= 60) {
            System.out.println((((ovenMin % 60) + min) - 60));
        } else {
            System.out.println(((ovenMin % 60) + min));
        }
        
    }
}
