public class IntQuickSorter {
    public static void quickSort(int array[]) {
        doQuickSort(array, 0, array.length - 1);
    }

    private static void doQuickSort(int array[], int start, int end) {
        int pivotPoint;

        if (start < end) {
            pivotPoint = partition(array, start, end);

            doQuickSort(array, start, pivotPoint - 1);

            doQuickSort(array, pivotPoint + 1, end);
        }
    }

    private static int partition(int array[], int start, int end) {
        int pivotValue;
        int endOfLeftList;
        int mid;

        mid = (start + end) / 2;

        // Swap the middle element with the first element.
        // This moves the pivot value to the start of the list.
        swap(array, start, mid);

        // Save the pivot value for comparisons.
        pivotValue = array[start];

        // For now, the end of the left sublist is the first element.
        endOfLeftList = start;

        // Scan the entire list and move any values that are less than the pivot value to the left sublist.
        for (int scan = start + 1; scan <= end; scan++) {
            if (array[scan] < pivotValue) {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }

        // Move the pivot value to end of the left sublist.
        swap(array, start, endOfLeftList);

        // Return the subscript of the pivot value.
        return endOfLeftList;
    }

    private static void swap(int[] array, int a, int b) {
        int temp;

        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
