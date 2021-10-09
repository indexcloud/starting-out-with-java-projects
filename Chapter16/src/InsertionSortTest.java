/**
 * This program tests the insertionSort method in the IntInsertionSorter class.
 */

public class InsertionSortTest {
    public static void main(String[] args)
    {
        int[] values = {5, 1, 3, 6, 4, 2};

        System.out.println("Original order:");
        for (int element : values)
            System.out.print(element + " ");

        IntInsertionSorter.insertionSort(values);

        System.out.println("\nSorted order:");
        for (int element : values)
            System.out.print(element + " ");

        System.out.println();
    }
}
