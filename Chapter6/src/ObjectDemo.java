import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class ObjectDemo {
    public static void main(String[] args) throws IOException {
        int maxNumbers;
        int number;

        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Create a Random object to generate random numbers.
        Random rand = new Random();

        // Create a PrintWriter object to open the file.
        PrintWriter outputFile = new PrintWriter("numbers.txt");

        // Get the number of random numbers to write.
        System.out.print("How many random numbers should I write? ");
        maxNumbers = keyboard.nextInt();

        // Write the randoms to the file.
        for (int count = 0; count < maxNumbers; count++) {
            // Generate a random integer.
            number = rand.nextInt();

            // Write the random integer to the file.
            outputFile.println(number);
        }

        // Close the file.
        outputFile.close();
        System.out.println("Done");
    }
}
