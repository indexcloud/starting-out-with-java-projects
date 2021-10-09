public class ObjectInsertionSortTest {
    public static void main(String[] args) {
        String[] values = {"David", "Abe", "Katherine", "Beth", "Jeff", "Daisy" };

        System.out.println("Original order:");
        for (String element : values)
            System.out.print(element + " ");

        ObjectInsertionSorter.insertionSort(values);

        System.out.println("\nSorted order:");
        for (String element : values)
            System.out.print(element + " ");

        System.out.println();
    }
}
