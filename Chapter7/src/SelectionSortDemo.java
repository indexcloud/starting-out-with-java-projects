/**
 * This program demonstrates the selectionSort method in teh ArrayTools class.
 */

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] values = {5, 7, 2, 8, 9, 1};

        // Display the unsorted array.
        System.out.print("The unsorted values are:");
        for (int i = 0; i < values.length; i++)
            System.out.print(values[i] + " ");
        System.out.println();

        // Sort the array.
        selectionSort(values);

        // Display the sorted array.
        System.out.println("The sorted values are:");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    /**
     * The selectionSort method perform a selection sort on an int array. The array is sorted in ascending order.
     * @param array The array to sort.
     */

    public static void selectionSort(int[] array) {
        int startScan, index, minIndex, minValue;

        for (startScan = 0; startScan < array.length; startScan++) {
            minIndex = startScan;
            minValue = array[startScan];

            for (index = startScan + 1; index < array.length; index++) {
                if (array[index] < minValue) {
                    minIndex = index;
                    minValue = array[index];
                }
            }

            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }
}