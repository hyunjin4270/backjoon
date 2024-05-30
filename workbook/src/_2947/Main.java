package _2947;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[5]; //목각인형 5개 준비
        for (int i = 0; i < 5; i++) {   //목각인형에 숫자 새겨넣기
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        while (compareArraySort(numbers)) { //정렬된 값이 맞을 때 까지 반복
            for (int i = 0; i < 5; i++) {
                if (i != 4 && numbers[i] > numbers[i + 1]) {
                    int change = numbers[i]; //값을 바꾸기위한 임시변수 생성
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = change;
                    print(numbers);
                }
            }
        }
    }

    static void print(int[] numbers) { //목각인형 위치 출력
        System.out.println(numbers[0] + " " +  numbers[1] + " " +  numbers[2] + " " +  numbers[3] + " " +  numbers[4]);

    }
    static boolean compareArraySort(int[] numbers) { //정말 목각인형이 정렬이 됐는지 비교
        int[] compareNumbers = new int[5];
        for (int i = 0; i < 5; i++) {
            compareNumbers[i] = numbers[i];
        }
        Arrays.sort(compareNumbers);
        for (int i = 0; i < 5; i++) {
            if (compareNumbers[i] != numbers[i]) { // 만약 정렬된 값하고 다르다면
                return true;
            }
        }
        return false; // 만약 정렬된 값이랑 같다면
    }
}

