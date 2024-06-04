package _2966;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    final static int NUMBER_OF_STUDENTS = 3;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Student[] students = new Student[NUMBER_OF_STUDENTS];
        students[0] = new Student("Adrian", "ABC");
        students[1] = new Student("Bruno", "BABC");
        students[2] = new Student("Goran", "CCAABB");
        br.readLine();
        String answer = br.readLine();
        for (int i = 0; i < students.length; i++) {
            students[i].checkAnswer(answer);
        }

        printResult(students);
    }
    static void printResult(Student[] students) {
        int max = -1;
        for (int i = 0; i < students.length; i++) {
            max = Math.max(max, students[i].getScore());
        }
        System.out.println(max);
        for (int i = 0; i < students.length; i++) {
            if (students[i].getScore() == max) {
                System.out.println(students[i].getName());
            }
        }
    }
    static class Student {
        private String name;
        private String pattern;
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
