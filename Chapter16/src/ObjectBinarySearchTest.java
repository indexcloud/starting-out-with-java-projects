import java.util.Arrays;
import java.util.Scanner;

public class ObjectBinarySearchTest {
    public static void main(String[] args)
    {
        int result;
        String searchValue;
        String input;

        String[] values = {"David", "Abe", "Katherine", "Beth", "Jeff", "Daisy" };

        Scanner keyboard = new Scanner(System.in);

        Arrays.sort(values);

        do
        {
            System.out.print("Enter a value to search for: ");
            searchValue = keyboard.nextLine();

            result = ObjectBinarySearcher.binarySearch(values, searchValue);

            if (result == -1)
                System.out.println(searchValue + " was not found.");
            else
            {
                System.out.println(searchValue + " was found at element " + result);
            }

            System.out.print("Do you want to search again? (Y or N): ");
            input = keyboard.nextLine();
        } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
    }
}
