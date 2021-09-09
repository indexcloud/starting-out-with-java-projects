import java.io.*;

/**
 * This program opens a binary file, reads and displays the contents.
 */

public class ReadBinaryFile {
    public static void main(String[] args) throws IOException {
        int number;
        boolean endOfFile = false;

        FileInputStream fstream = new FileInputStream("Numbers.dat");
        DataInputStream inputFile = new DataInputStream(fstream);

        System.out.println("Reading numbers from the file:");

        while(!endOfFile) {
            try {
                number = inputFile.readInt();
                System.out.print(number + " ");
            }
            catch(EOFException e) {
                endOfFile = true;
            }
        }

        System.out.println("\nDone.");

        inputFile.close();
    }
}
