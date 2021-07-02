import javax.swing.JOptionPane;

/**
 * This program demonstrates how a method can return a reference to an object.
 */

public class ReturnObject {
    public static void main(String[] args) {
        BankAccount account;

        account = getAccount();

        JOptionPane.showMessageDialog(null, "The account has a balance of $" +
                account.getBalance());

        System.exit(0);
    }

    /**
     * The getAccount method creates a BanAccount object with the balance specified by the user.
     * @return A reference to the object.
     */

    public static BankAccount getAccount() {
        String input;
        double balance;

        input = JOptionPane.showInputDialog("Enter the account balance.");
        balance = Double.parseDouble(input);

        return new BankAccount(balance);
    }
}
