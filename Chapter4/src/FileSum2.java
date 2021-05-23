import java.util.Scanner;
import java.io.*;

public class FileSum2 {
    public static void main(String[] args) throws IOException {
        double sum = 0.0;

        // Make sure the file exists.
        File file = new File("Numbers.txt");
        if (!file.exists()) {
            System.out.println("Teh file Numbers.txt is not found.");
            System.exit(0);
        }


        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            double number = inputFile.nextDouble();

            sum = sum + number;
        }

        inputFile.close();

        System.out.println("The sum of the numbers in " + "Numbers.txt is " + sum);
    }
}
