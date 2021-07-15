import java.io.*;

/**
 * This program uses the TestScoreReader class to read test scores from a file and get their averages.
 */

public class TestAverages {
    public static void main(String[] args) throws IOException {
        double average;
        int studentNumber = 1;

        TestScoreReader scoreReader = new TestScoreReader("Grades.csv");

        while (scoreReader.readNextLine()) {
            average = scoreReader.getAverage();

            System.out.println("Average for student " + studentNumber + " is " + average);

            studentNumber++;
        }

        scoreReader.close();
        System.out.println("No more scores.");
    }
}
