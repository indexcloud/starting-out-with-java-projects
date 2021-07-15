import java.io.*;
import java.util.Scanner;

/**
 * The TestScoreReader class reads test scores as tokens from a file and calculates the average of each line of scores.
 */

public class TestScoreReader {
    private Scanner inputFile;
    private String line;

    /**
     * The constructor opens a file to read the grades from.
     * @param filename
     * @throws IOException
     */
    public TestScoreReader(String filename) throws IOException {
        File file = new File(filename);
        inputFile = new Scanner(file);
    }

    public boolean readNextLine() throws IOException {
        boolean lineRead;

        lineRead = inputFile.hasNext();

        if (lineRead)
            line = inputFile.nextLine();

        return lineRead;
    }

    public double getAverage() {
        int total = 0;
        double average;

        String[] tokens = line.split(",");

        for (String str : tokens) {
            total += Integer.parseInt(str);
        }

        average = (double) total / tokens.length;

        return average;
    }

    public void close() throws IOException {
        inputFile.close();
    }
}
