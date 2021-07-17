import java.util.Scanner;

/**
 * This program demonstrates the CurvedActivity class which inherits from the GradedActivity class.
 */

public class CurvedActivityDemo {
    public static void main(String[] args) {
        double score;
        double curvePercent;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the student's raw numeric score: ");
        score = keyboard.nextDouble();

        System.out.print("Enter the curve percentage: ");
        curvePercent = keyboard.nextDouble();

        CurvedActivity curvedExam = new CurvedActivity(curvePercent);

        curvedExam.setScore(score);

        System.out.println("The raw score is " + curvedExam.getRawScore() + " points.");
        System.out.println("The curved score is " + curvedExam.getScore());
        System.out.println("The exam grade is " + curvedExam.getGrade());
    }
}
