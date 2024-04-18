import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int person = Integer.parseInt(br.readLine()); // 인원 수
        int result = 0; // 최댓값

        for (int i = 0; i < person; i++) {
            result = Math.max(result, rollDice(br.readLine()));
        }
        System.out.println(result);
    }

    static int rollDice(String br) { // 결과값 결정
        String[] strNumbers = br.split(" ");
        Dice[] dice = new Dice[6];
        for (int i = 0; i < strNumbers.length; i++) {
            if (dice[Integer.parseInt(strNumbers[i]) - 1] == null) {
                dice[Integer.parseInt(strNumbers[i]) - 1] = new Dice(strNumbers[i]);
            } else {
                dice[Integer.parseInt(strNumbers[i]) - 1].PlusCount();
            }
        }

        return decidePrice(dice);
    }

    static int decidePrice(Dice[] dice) {
        int nullCount = 0;
        int maxNumber = 0;
        int maxCount = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] != null) {
                maxNumber = Math.max(dice[i].INT_NUMBER, maxNumber);
                maxCount = Math.max(dice[i].count, maxCount);
            } else {
                nullCount++;
            }
        }

        if (nullCount == 5) {
            for (int i = 0; i < dice.length; i++) {
                if (dice[i] != null && maxCount == dice[i].count) {
                    return 50000 + dice[i].INT_NUMBER * 5000;
                }
            }
        } else if (nullCount == 4) {
            int maxCount2 = 0;
            for (int i = 0; i < dice.length; i++) {
                if (dice[i] != null) {
                    maxCount2 = Math.max(maxCount2, dice[i].count);
                }
            }
            if (maxCount2 == 3) {
                for (int i = 0; i < dice.length; i++) {
                    if (dice[i] != null && maxCount == dice[i].count) {
                        return 10000 + dice[i].INT_NUMBER * 1000;
                    }
                }
            } else {
                int money = 2000;
                for (int i = 0; i < dice.length; i++) {
                    if (dice[i] != null && dice[i].count != 1) {
                        money += dice[i].INT_NUMBER * 500;
                    }
                }
                return money;
            }
        } else if (nullCount == 3) {
            for (int i = 0; i < dice.length; i++) {
                if (dice[i] != null && maxCount == dice[i].count) {
                    return 1000 + dice[i].INT_NUMBER * 100;
                }
            }
        } else {
            return maxNumber * 100;
        }
        return 0;
    }

    static class Dice {
        final String STR_NUMBER;
        final int INT_NUMBER;
        int count = 1;
        static boolean doubleNumber = false;

        Dice(String number) {
            STR_NUMBER = number;
            INT_NUMBER = Integer.parseInt(STR_NUMBER);
        }

        void PlusCount() {
            count++;
        }

        void isDouble() {
            doubleNumber = !doubleNumber;
        }

    }
}
