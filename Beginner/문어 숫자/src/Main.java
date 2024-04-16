import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector signs = new Vector<>();

        while (true) {
            Sign sign = new Sign(scanner.nextLine());
            if (sign.SIGN.equals("#")) {
                break;
            } else {
                signs.add(sign);
            }
        }
        scanner.close();

        for (int i = 0; i < signs.size(); i++) {
            System.out.println(IntSign((Sign) signs.get(i)));
            ;
        }

    }

    static class Sign {
        private final String SIGN;
        private char[] eachSign;

        Sign(String sign) {
            SIGN = sign;
            EachSign();
        }

        void EachSign() {
            eachSign = new char[SIGN.length()];
            for (int i = 0; i < SIGN.length(); i++) {
                eachSign[i] = SIGN.charAt(i);
            }
        }
    }

    static int IntSign(Sign sign) {
        int result = 0;
        for (int i = 0; i < sign.eachSign.length; i++) {
            if (sign.eachSign[i] == '-')
                result += 0 * Math.pow(8, (sign.eachSign.length - (i + 1)));
            else if (sign.eachSign[i] == '\\')
                result += Math.pow(8, sign.eachSign.length - (i + 1));
            else if (sign.eachSign[i] == '(')
                result += 2 * Math.pow(8, (sign.eachSign.length - (i + 1)));
            else if (sign.eachSign[i] == '@')
                result += 3 * Math.pow(8, (sign.eachSign.length - (i + 1)));
            else if (sign.eachSign[i] == '?')
                result += 4 * Math.pow(8, (sign.eachSign.length - (i + 1)));
            else if (sign.eachSign[i] == '>')
                result += 5 * Math.pow(8, (sign.eachSign.length - (i + 1)));
            else if (sign.eachSign[i] == '&')
                result += 6 * Math.pow(8, (sign.eachSign.length - (i + 1)));
            else if (sign.eachSign[i] == '%')
                result += 7 * Math.pow(8, (sign.eachSign.length - (i + 1)));
            else if (sign.eachSign[i] == '/')
                result += -1 * Math.pow(8, (sign.eachSign.length - (i + 1)));
        }

        return result;
    }
}
