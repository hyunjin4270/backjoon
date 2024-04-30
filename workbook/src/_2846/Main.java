package _2846;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //길 수(버림)
        StringTokenizer load = new StringTokenizer(br.readLine()); //길

        int pos1 = Integer.parseInt(load.nextToken()); // 첫번째 지점
        int pos2 = Integer.parseInt(load.nextToken()); // 두번째 지점
        int maximumHeight = pos2 - pos1; //최대 오르막길 높이

        while (load.countTokens() != 0) {
            if (pos1 < pos2) { // 만약 오르막길 일때
                int pos1Save = pos1;    //시작점 저장
                while (pos1 < pos2) {
                    maximumHeight = Math.max(maximumHeight, (pos2 - pos1Save));
                    if (load.countTokens() != 0) {  //만약 다음 지점이 있을 때
                        pos1 = pos2;
                        pos2 = Integer.parseInt(load.nextToken());

                    }
                    else break; //만약 다음 지점이 없을 떄
                }
            } else { // 만약 내리막길 일때
                pos1 = pos2;
                pos2 = Integer.parseInt(load.nextToken());
            }
        }

        if (maximumHeight < 0) maximumHeight = 0;   // 내리막길만 있었을 때, 최대 높이를 0으로 지정
        System.out.println(maximumHeight);
    }
}
