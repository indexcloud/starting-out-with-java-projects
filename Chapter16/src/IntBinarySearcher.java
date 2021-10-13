/**
 * The IntBinarySearcher class provides a public static method for performing a binary search on an int array.
 */

public class IntBinarySearcher {
    public static int search(int[] array, int value) {
        int first;
        int last;
        int middle;
        int position;
        boolean found;

        first = 0;
        last = array.length - 1;
        position = -1;
        found = false;

        while (!found && first <= last) {
            middle = (first + last) / 2;

            if (array[middle] == value) {
                found = true;
                position = middle;
            }
            else if (array[middle] > value)
                last = middle - 1;
            else
                first = middle + 1;
        }

        return position;
    }
}
