import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int capacity = Integer.parseInt(br.readLine());
        if (capacity % 4 != 0) {
            capacity += 4 - (capacity % 4);
        }
        for (int i = 0; i < capacity / 4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
