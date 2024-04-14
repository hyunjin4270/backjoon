package try1;

public class InputNumber {
    static void printBinary(String twoNumber) {
        int[] numbers = convertInt(twoNumber);
        convertBinary(numbers);

    }
    static void convertBinary(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            String stringBin = Integer.toBinaryString(numbers[i]);
            int intBin = Integer.parseInt(stringBin);
            System.out.printf("%d = %08d \n", numbers[i], intBin);
        }
    }

    static int[] convertInt(String twoNumber) {
        int[] numbers = new int[2];
        String[] splitNumber = twoNumber.split(" ", 2);
        for (int i = 0; i < splitNumber.length; i++) {
            numbers[i] = Integer.parseInt(splitNumber[i]);
        }
        return numbers;
    }
    
    
}
