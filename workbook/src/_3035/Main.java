package _3035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
                    changedPattern.append(pattern.pattern[i / pattern.getChangeHeightValue()].charAt(j / pattern.getChangeWidthValue()));
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

        private final String[] pattern;
        Pattern(String information) throws IOException {
            StringTokenizer st = new StringTokenizer(information);
            height = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());
            changeHeightValue = Integer.parseInt(st.nextToken());
            changeWidthValue = Integer.parseInt(st.nextToken());
            pattern = new String[height];
            setPattern();
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

        void setPattern() throws IOException {
            for (int i = 0; i < height; i++) {
                pattern[i] = br.readLine();
            }

        }
        void changeShape(ShapeConversion shapeConversion) {
            shapeConversion.changeShape(this);
        }
    }
    public static void main(String[] args) throws Exception {
        Pattern pattern = new Pattern(br.readLine());
        pattern.changeShape(new Increase());
    }
}