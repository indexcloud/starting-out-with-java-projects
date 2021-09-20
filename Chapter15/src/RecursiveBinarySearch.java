import java.util.Scanner;

/**
 * This program demonstrates the recursive binary search method.
 */

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int searchValue;
        int result;
        String input;
        char again;

        int numbers[] = {101, 142, 147, 189, 199, 207, 222,
                234, 289, 296, 310, 319, 388, 394, 417, 429, 447, 521, 536, 600};

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Enter a value to search for: ");
            searchValue = keyboard.nextInt();

            result = binarySearch(numbers, 0, (numbers.length - 1), searchValue);

            if (result == -1) {
                System.out.println(searchValue + " was not found.");
            }
            else {
                System.out.println(searchValue + " was found at element " + result);
            }

            System.out.print("Do you want to search again? " + "(Y or N) : ");
            keyboard.nextLine();
            input = keyboard.nextLine();

        } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
    }

    public static int binarySearch(int[] array, int first, int last, int value) {
        int middle;

        if (first > last)
            return -1;

        middle = (first + last) / 2;

        if (array[middle] == value)
            return middle;
        else if (array[middle] < value)
            return binarySearch(array, middle + 1, last, value);
        else
            return binarySearch(array, first, middle - 1, value);
    }
}
