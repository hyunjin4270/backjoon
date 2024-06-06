package _3035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    static void printPattern(StringBuilder pattern) {
        System.out.println(pattern);
    }

    interface ShapeConversion {
        void changeShape(Pattern pattern);
    }

    static class Increase implements ShapeConversion {

        @Override
        public void changeShape(Pattern pattern) {
            StringBuilder changedPattern = new StringBuilder();
            for (int i = 0; i < (pattern.getHeight() * pattern.getChangeHeightValue()); i++) {
                for (int j = 0; j < (pattern.getWidth() * pattern.getChangeWidthValue()); j++) {
                    changedPattern.append(pattern.patternInformation[i / pattern.getChangeHeightValue()].charAt(j / pattern.getChangeWidthValue()));
                }
                changedPattern.append("\n");
            }
            printPattern(changedPattern);
        }
    }
    static class Pattern {
        private final int width;
        private final int height;
        private final int changeWidthValue;
        private final int changeHeightValue;

        private final String[] patternInformation;
        Pattern(BufferedReader bufferedReader) throws IOException {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            height = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());
            changeHeightValue = Integer.parseInt(st.nextToken());
            changeWidthValue = Integer.parseInt(st.nextToken());
            patternInformation = new String[height];
            setPatternInformation(bufferedReader);
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int getChangeWidthValue() {
            return changeWidthValue;
        }

        public int getChangeHeightValue() {
            return changeHeightValue;
        }

        void setPatternInformation(BufferedReader br) throws IOException {
            for (int i = 0; i < height; i++) {
                patternInformation[i] = br.readLine();
            }
        }
        void changeShape(ShapeConversion shapeConversion) {
            shapeConversion.changeShape(this);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = new Pattern(br);
        pattern.changeShape(new Increase());
    }
}