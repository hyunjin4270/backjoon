import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //scanner �� ����

        int[] alpha = new int[26]; //���ĺ� ���� �迭
        int max = 0;
        String input; //EOF ó���� ���� ���� ���ڿ�;; �̰Ŷ��� ��û ���
        String str = "";


        //���ڸ����̿����� �Է��� ���� �𸣱� ������ ���Ƿ� ���� �� �� �� ġ�� ���α׷� ����ǰԲ� while���� ���� �� ���� �� �־��� [&& !input.isEmpty()]
        //�ٵ� ���ؿ����� �� �̷��� �ϸ� �ν� �ȵż� ���ߵ� �� ����
        //���ڸ����̿��� ����ǰ� ����� ���ǹ��� while ((input = br.readLine()) != null && !input.isEmpty())
        while ((input = br.readLine()) != null) {
            str += input;
        }

        //���ĺ� ���� ���� �� ���� ���� ���� ���ĺ��� Ƚ�� ����
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                alpha[str.charAt(i) - 'a']++;

                if (alpha[str.charAt(i) - 'a'] > max) {
                    max = alpha[str.charAt(i) - 'a'];
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (max == alpha[i]) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}

