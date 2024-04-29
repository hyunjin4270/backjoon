package _2822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int QUESTION_MARK = 8;
        Question[] questions = new Question[QUESTION_MARK];
        Question[] solutions = new Question[5];
        int maxScore = 0;
        for (int i = 0; i < QUESTION_MARK; i++) {
            questions[i] = new Question(Integer.parseInt(br.readLine()), (i + 1));
        }

        for (int i = 0; i < (QUESTION_MARK - 4); i++) {
            for (int j = (i + 1); j < (QUESTION_MARK - 3); j++) {
                for (int k = (j + 1); k < (QUESTION_MARK - 2); k++) {
                    for (int l = (k + 1); l < (QUESTION_MARK - 1); l++) {
                        for (int m = (l + 1); m < QUESTION_MARK; m++) {
                            if ((questions[i].score + questions[j].score + questions[k].score + questions[l].score + questions[m].score) > maxScore) {
                                maxScore = questions[i].score + questions[j].score + questions[k].score + questions[l].score + questions[m].score;
                                solutions[0] = questions[i];
                                solutions[1] = questions[j];
                                solutions[2] = questions[k];
                                solutions[3] = questions[l];
                                solutions[4] = questions[m];
                            }
                        }
                    }
                }
            }
        }
        System.out.println(maxScore);
        for (int i = 0; i < 5; i++) {
            System.out.print(solutions[i].number);
            if (i != 4) {
                System.out.print(" ");
            }
        }

    }

    static class Question {
        int score;
        int number;
        Question(int score, int number) {
            this.score = score;
            this.number = number;
        }
    }
}
