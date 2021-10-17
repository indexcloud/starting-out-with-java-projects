import java.util.*;

/**
 * Demonstrates the list iterator
 */

public class ListIteratorDemo {
    public static void main(String[] args) {
        String [] names = {"Chris", "David", "Katherine", "Kenny"};
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println("Here are the original names.");
        System.out.println(nameList);

        // Get a list iterator.
        ListIterator<String> it = nameList.listIterator();

        while (it.hasNext())
        {
            String str = it.next();
            // If the last name retrieved was "Chris" then insert "Darlene".
            if (str.equalsIgnoreCase("Chris"))
            {
                it.add("Darlene");
                break;
            }
        }

        System.out.println("\nHere are the new names now.");
        System.out.println(nameList);
    }
}
