import javax.swing.JOptionPane;

/**
 * This program displays the number of letters, digits, and whitespace characters in a string.
 */

public class StringAnalyzer {
    public static void main(String[] args) {
        String input;
        char[] array;
        int letters = 0;
        int digits = 0;
        int whitespaces = 0;

        input = JOptionPane.showInputDialog("Enter a string:");

        array = input.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i]))
                letters++;
            else if (Character.isDigit(array[i]))
                digits++;
            else if (Character.isWhitespace(array[i]))
                whitespaces++;
        }

        JOptionPane.showMessageDialog(null, "That string contains " + letters +
                " letters, " + digits + " digits, and " + whitespaces + " whitespace characters.");
        System.exit(0);
    }
}
