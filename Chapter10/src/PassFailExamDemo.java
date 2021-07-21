import java.util.Scanner;

/**
 * This program demonstrates the PassFailExam class.
 */

public class PassFailExamDemo {
    public static void main(String[] args) {
        int questions;
        int missed;
        double minPassing;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many questions are on the exam?");
        questions = keyboard.nextInt();

        System.out.print("How many questions did the student missed?");
        missed = keyboard.nextInt();

        System.out.print("What is the minimum passing score?");
        minPassing = keyboard.nextDouble();

        PassFailExam exam = new PassFailExam(questions, missed, minPassing);

        System.out.println("Each question counts " + exam.getPointsEach() + " points.");

        System.out.println("The exam score is " + exam.getScore());

        System.out.println("The exam grade is " + exam.getGrade());
    }
}
