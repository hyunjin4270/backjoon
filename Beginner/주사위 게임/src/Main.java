import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int person = Integer.parseInt(br.readLine());   //인원 수
        int result = 0; // 최댓값
        for (int i = 0; i < person; i++) {
            result = Math.max(result, rollDice(br.readLine()));
        }
        System.out.println(result);
    }

    static int rollDice(String br) { // 결과값 결정
        String[] brs = br.split(" ");
        int[] numbers = new int[3];
        for (int i = 0; i < brs.length; i++) {
            numbers[i] = Integer.parseInt(brs[i]);
        }

        if (numbers[0] == numbers[1] && numbers[0] == numbers[2]) {
            return 10000 + (maxDice(numbers) * 1000);
        }
        else if (numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[1] == numbers[2]) {
            return 1000 + (maxDice(numbers) * 100);
        }
        else {
            return maxDice(numbers) * 100;
        }
    }

    static int maxDice(int[] numbers) { //주사위 눈 최대값
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
    }

}
