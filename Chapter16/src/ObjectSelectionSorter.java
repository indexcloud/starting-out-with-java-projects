public class ObjectSelectionSorter {
    public static void selectionSort(Comparable[] array) {
        int startScan;
        int index;
        int minIndex;
        Comparable minValue;

        for (startScan = 0; startScan < array.length - 1; startScan++)
        {
            minIndex = startScan;
            minValue = array[startScan];

            for (index = startScan + 1; index < array.length; index++)
            {
                if (array[index].compareTo(minValue) < 0)
                {
                    minValue = array[index];
                    minIndex = index;
                }
            }

            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }
}
