import java.util.ArrayList;

/**
 * This program demonstrates an ArrayList.
 */

public class ArrayListDemo3 {
    public static void main(String[] args)
    {
        // Create an ArrayList to hold some names.
        ArrayList<String> nameList = new ArrayList<String>();

        // Add some names to the ArrayList.
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Index: " + index + " name: " + nameList.get(index));
        }

        // Now remove teh item at index 1.
        nameList.remove(1);

        System.out.println("The item at index 1 is removed. Here are the items now.");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Index: " + index + " name: " + nameList.get(index));
        }

        System.out.println(nameList);
    }
}
