import java.util.Scanner;

public class RecursiveBinarySearchTest {
    public static void main(String[] args) {
        int result, searchValue;
        String input;

        int numbers[] = { 536, 289, 296, 429, 319, 142, 394,
                101, 388, 147, 417, 199, 207, 222, 189, 310, 447, 521, 234, 600};

        Scanner keyboard = new Scanner(System.in);

        IntQuickSorter.quickSort(numbers);

        do {
            System.out.print("Enter a value to search for: ");
            searchValue = keyboard.nextInt();

            result = RecursiveBinarySearcher.search(numbers, searchValue);

            if (result == -1)
                System.out.println(searchValue + " was not found.");
            else {
                System.out.println(searchValue + " was found at element " + result);
            }

            // Consume the remaining newline.
            keyboard.nextLine();

            System.out.print("Do you want to search again? (Y or N): ");
            input = keyboard.nextLine();
        } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
    }
}
