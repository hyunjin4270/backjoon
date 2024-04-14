package try1;

public class InputNumber {
    private InputNumber() {}
    static void printBinary(String twoNumber) {
        int[] numbers = convertInt(twoNumber);
        convertBinary(numbers);
        convertMinusBinary(numbers);
        minusTwoNumber(numbers);
    }

    private static int[] convertInt(String twoNumber) {
        int[] numbers = new int[2];
        String[] splitNumber = twoNumber.split(" ", 2);
        for (int i = 0; i < splitNumber.length; i++) {
            numbers[i] = Integer.parseInt(splitNumber[i]);
        }
        return numbers;
    }

    private static void convertBinary(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            String stringBin = Integer.toBinaryString(numbers[i]);
            int intBin = Integer.parseInt(stringBin);
            System.out.printf("%d = %08d \n", numbers[i], intBin);
        }
    }


    
    private static void convertMinusBinary(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int minusNumber = 0 - numbers[i];
            String stringBin = Integer.toBinaryString(minusNumber).substring(24);
            int intBin = Integer.parseInt(stringBin);
            System.out.printf("%d = %08d \n", minusNumber, intBin);
        }
    }

    private static void minusTwoNumber(int[] numbers) {
        int minusNumber = numbers[0] - numbers[1];
        if (minusNumber < 0) {
            String stringBin = Integer.toBinaryString(minusNumber).substring(24);
            int intBin = Integer.parseInt(stringBin);
            System.out.printf("%d = %08d \n", minusNumber, intBin);
        } else {
            String stringBin = Integer.toBinaryString(minusNumber);
            int intBin = Integer.parseInt(stringBin);
            System.out.printf("%d = %08d \n", minusNumber, intBin);
        }
    }
}
