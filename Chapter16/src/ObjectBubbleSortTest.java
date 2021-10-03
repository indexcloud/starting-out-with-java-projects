/**
 * This program tests the bubbleSort method in the ObjectBubbleSorter class.
 */

public class ObjectBubbleSortTest {
    public static void main(String[] args)
    {
        // Note that String implements Comparable.
        String[] values = {"David", "Abe", "Katherine", "Beth", "Jeff", "Daisy" };

        System.out.println("Original order:");
        for (String element : values)
            System.out.print(element + " ");

        ObjectBubbleSorter.bubbleSort(values);

        System.out.println("\nSorted order:");
        for (String element : values)
            System.out.print(element + " ");

        System.out.println();
    }
}
