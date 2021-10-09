public class ObjectSelectionSortTest {
    public static void main(String[] args) {
        String[] values = {"David", "Abe", "Katherine", "Beth", "Jeff", "Daisy" };

        System.out.println("Original order:");
        for (String element : values)
            System.out.print(element + " ");

        ObjectSelectionSorter.selectionSort(values);

        System.out.println("\nSorted order:");
        for (String element : values)
            System.out.print(element + " ");

        System.out.println();
    }
}
