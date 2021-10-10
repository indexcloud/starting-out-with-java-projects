/**
 * The IntSequentialSearcher class provides a public static method for performing a sequential search on an int array.
 */

public class IntSequentialSearcher {
    public static int search(int[] array, int value) {
        int index;
        int position;
        boolean found;

        index = 0;

        position = -1;
        found = false;

        while (!found && index < array.length) {
            if (array[index] == value) {
                found = true;
                position = index;
            }
            index++;
        }

        return position;
    }
}
