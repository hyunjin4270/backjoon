package _2966;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        Student[] students = new Student[] {
                new Student("Adrian", "ABC"),
                new Student("Bruno", "BABC"),
                new Student("Goran", "CCAABB")
        };
        String answer = br.readLine();
        for (Student student : students) {
            student.checkAnswer(answer);
        }
        printResult(students);
    }

    static void printResult(Student[] students) {
        int max = -1;
        for (Student student : students) {
            max = Math.max(max, student.getScore());
        }
        System.out.println(max);
        for (Student student : students) {
            if (student.getScore() == max) {
                System.out.println(student.getName());
            }
        }
    }
    static class Student {
        private final String name;
        private final String pattern;
        private int score;
        Student(String name, String pattern) {
            this.name = name;
            this.pattern = pattern;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        void checkAnswer(String answer) {
            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == pattern.charAt((i % pattern.length()))) {
                    score++;
                }
            }
        }
    }
}
