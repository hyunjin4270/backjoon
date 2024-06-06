package _3040;

import java.io.BufferedReader;

public class Main {
    final static int NUMBER_OF_DWARFS = 9;
    final static int NUMBER_OF_DWARFS_TO_SELECT = 7;

    interface CrunchingNumber {
        void filteredNumbers(NumberArray numberArray);
        void printSelectedNumbers(NumberArray numberArray);
    }
    static class Filtering implements CrunchingNumber {
        private final int targetCount;
        private final int targetSum;
        private final boolean[] selectedIndex;
        int sum = 0;
        int index = 0;
        int count;


        public Filtering(int targetCount, int targetSum) {
            this.targetCount = targetCount;
            this.targetSum = targetSum;
            selectedIndex = new boolean[targetCount];
        }
        @Override
        public void filteredNumbers(NumberArray numberArray) {


        }

        @Override
        public void printSelectedNumbers(NumberArray numberArray) {
            for (int i = 0; i < numberArray.size; i++) {
                if (selectedIndex[i]) {
                    System.out.println(numberArray.getNumbers(i));
                }
            }
        }
    }
    static class NumberArray {
        private final int size;
        private final int[] numbers;
        NumberArray(int size) {
            this.size = size;
            numbers = new int[size];
        }
        void setNumbers(BufferedReader bufferedReader) {
            try {
                for (int i = 0; i < NUMBER_OF_DWARFS; i++) {
                    numbers[i] = Integer.parseInt(bufferedReader.readLine());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public int getNumbers(int index) {
            return numbers[index];
        }
    }
}
