package _2846;
import java.util. * ;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        int sum = 0; // 오르막길마다 합
        int result = 0;

        for (int i = 0; i < N - 1; i++) {
            if (arr[i] < arr[i + 1]) sum += (arr[i + 1] - arr[i]);
            else sum = 0;
            result = Math.max(result, sum);
        }

        System.out.println(result);


    }
}

