package _2857;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;  //fbi 몇명인지 세기

        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (br.readLine().contains("FBI")) { // 만약 이름에 "FBI"가 들어간다면
                if (count != 0) { // 만약 첫번 째 출력이 아니라면
                    name.append(" ");
                }
                count++;
                name.append((i + 1));

            }
        }

        if (count == 0) System.out.println("HE GOT AWAY!"); //fbi가 없다면
        else System.out.println(name);


    }
}
