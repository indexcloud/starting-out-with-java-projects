public class Lengths {
    public static void main(String[] args) {
        int[][] numbers = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12} };

        // Display the number of rows.
        System.out.println("The number of rows is " + numbers.length);

        // Display the number of columns in each row.
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("The number of columns in row " + index + " is " + numbers[index].length);
        }
    }
}
