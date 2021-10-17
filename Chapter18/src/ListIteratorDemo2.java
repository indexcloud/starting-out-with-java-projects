import java.util.*;

public class ListIteratorDemo2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();

        nameList.add("Chris");
        nameList.add("David");
        nameList.add("Katherine");
        nameList.add("Kenny");

        System.out.println("Here are the original names.");
        System.out.println(nameList);

        ListIterator<String> it = nameList.listIterator();

        if (it.hasNext())
        {
            it.next();

            it.set("Alfonso");
        }

        // Move the iterator to the end of the list.
        while (it.hasNext())
        {
            it.next();
        }

        // Remove the last element that was retrieved.
        it.remove();

        System.out.println("\nHere are the names now.");
        System.out.println(nameList);
    }
}
