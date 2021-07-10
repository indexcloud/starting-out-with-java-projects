import javax.swing.JOptionPane;

/**
 * This program tests a customer number to verify that it is in the proper format.
 */

public class CustomerNumber {
    public static void main(String[] args) {
        String input;

        input = JOptionPane.showInputDialog("Enter a customer number in the form LLLNNNN\n" +
                "(LLL = letters and NNNN = numbers)");

        if (isValid(input)) {
            JOptionPane.showMessageDialog(null, "That's a valid customer number.");
        }
        else {
            JOptionPane.showMessageDialog(null, "That is not the proper format of a " +
                    "customer number.\nHere is an example: ABC1234");
        }

        System.exit(0);
    }

    private static boolean isValid(String custNumber) {
        boolean goodSoFar = true;  // Flag
        int i = 0;                 // Control variable

        // Test the length.
        if (custNumber.length() != 7)
            goodSoFar = false;

        // Test the first three characters for letters.
        while (goodSoFar && i < 3) {
            if (!Character.isLetter(custNumber.charAt(i)))
                goodSoFar = false;
            i++;
        }

        // Test the last four characters for digits.
        while (goodSoFar && i < 7) {
            if (!Character.isDigit(custNumber.charAt(i)))
                goodSoFar = false;
            i++;
        }

        return goodSoFar;
    }
}
