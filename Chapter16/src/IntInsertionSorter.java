/**
 * The IntInsertionSorter class provides a public static method for performing an insertion sort on an array.
 */

public class IntInsertionSorter {
    public static void insertionSort(int[] array)
    {
        int unsortedValue;
        int scan;

        for (int index = 1; index < array.length; index++)
        {
            unsortedValue = array[index];

            scan = index;

            while (scan > 0 && array[scan - 1] > unsortedValue)
            {
                array[scan] = array[scan - 1];
                scan--;
            };

            array[scan] = unsortedValue;
        }
    }
}
