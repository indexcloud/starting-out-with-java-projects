import java.io.*;

/**
 * This program deserializes the objects in the Objects.dat file and stores them in an array.
 */

public class DeserializeObjects {
    public static void main(String[] args) throws Exception {
        double balance;
        final int NUM_ITEMS = 3;

        FileInputStream inStream = new FileInputStream("Objects.dat");
        ObjectInputStream objectInputFile = new ObjectInputStream(inStream);

        BankAccount2[] accounts = new BankAccount2[NUM_ITEMS];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = (BankAccount2) objectInputFile.readObject();
        }

        objectInputFile.close();

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account " + (i + 1) + " $ " + accounts[i].getBalance());
        }
    }
}
