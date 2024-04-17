import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[9];
        int overHundred = -100;
        int[] sccuess = new int[7];
        int count = 0;

        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt();
            scanner.nextLine();
            overHundred += ages[i];
        }
        a: for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                if (i != j && (overHundred - (ages[i] + ages[j])) == 0) {

                    for (int k = 0; k < sccuess.length; k++) {

                        sccuess[k] = ages[k + count];
                        if (k == i || k == j) {

                            if (k + 1 == i || k + 1 == j) {
                                count++;
                                sccuess[k] = ages[k + 2];
                            } else {
                                count++;
                                sccuess[k] = ages[k + count];

                            }
                        }
                        if (sccuess.length - 1 == k) {
                            break a;
                        }
                    }
                }

            }
        }
        Arrays.sort(sccuess);
            for (int k = 0; k < sccuess.length; k++) {
                System.out.println(sccuess[k]);
            }
    }

}
