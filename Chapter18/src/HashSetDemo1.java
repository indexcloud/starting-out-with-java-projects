import java.util.*;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();

        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Pear");
        fruitSet.add("Strawberry");

        System.out.println("Here are the elements.");
        System.out.println(fruitSet);

        // Try to add a duplicate element.
        System.out.println("\nTrying to add Banana to the set again...");
        if (!fruitSet.add("Banana"))
        {
            System.out.println("Banana was not added again.");
        }

        System.out.println("\nHere are teh elements once more.");
        System.out.println(fruitSet);
    }
}
