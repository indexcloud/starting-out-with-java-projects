/**
 * The IntSelectionSorter class provides a public static method for performing a selection sort on an int array.
 */

public class IntSelectionSorter {
    public static void selectionSort(int[] array)
    {
        int startScan;
        int index;
        int minIndex;
        int minValue;

        for (startScan = 0; startScan < array.length - 1; startScan++) {
            minIndex = startScan;
            minValue = array[startScan];

            for (index = startScan + 1; index < array.length; index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                }
            }

            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }
}
