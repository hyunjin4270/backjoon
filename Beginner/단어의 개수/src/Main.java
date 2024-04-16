import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        scanner.close();
        if (str.equals("")) {
            System.out.println("0");
        } else {
            String[] Strs = str.split(" ");
            System.out.println(Strs.length);
        }
    } 

    
}
