/**
 * This program tests the selectionSort method in the IntSelectionSorter class.
 */

public class SelectionSortTest {
    public static void main(String[] args)
    {
        int[] values = {5, 1, 3, 6, 4, 2};

        System.out.println("Original order:");
        for (int element : values)
            System.out.print(element + " ");

        IntSelectionSorter.selectionSort(values);

        System.out.println("\nSorted order:");
        for (int element : values)
            System.out.print(element + " ");

        System.out.println();
    }

}
