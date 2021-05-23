import java.util.Scanner;
import java.io.*;

public class FileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        String filename;
        String friendName;
        int numFriends;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();

        // Consume the remaining newline character.
        keyboard.nextLine();

        // Get the filename;
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();

        // Make sure the file does not exist.
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("The file " + filename + " already exists.");
            System.exit(0);
        }

        // Open the file.
        PrintWriter outputFile = new PrintWriter(file);

        // Get data and write it to the file.
        for (int i = 1; i <= numFriends; i++) {
            // Get the name of a friend.
            System.out.println("Enter the name of friend " + "number " + i + ": ");
            friendName = keyboard.nextLine();

            // Write the nam to the file.
            outputFile.println(friendName);
        }

        // Close the file.
        outputFile.close();
        System.out.println("Data written to the file.");
    }
}
