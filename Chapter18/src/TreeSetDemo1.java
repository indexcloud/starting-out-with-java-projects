import java.util.*;

public class TreeSetDemo1 {
    public static void main(String[] args)
    {
        SortedSet<String> mySet = new TreeSet<>();
        mySet.add("Pear");
        mySet.add("Apple");
        mySet.add("Strawberry");
        mySet.add("Banana");

        System.out.println("Here are the TreeSet elements in ascending order:");
        System.out.println(mySet);

        System.out.println("\nAdding Blueberry to the set.");
        mySet.add("Blueberry");

        System.out.println("\nHere are the TreeSet elements again:");
        System.out.println(mySet);
    }
}
