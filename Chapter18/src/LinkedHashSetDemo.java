import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args)
    {
        List<String> fruitList = Arrays.asList("Apple", "Strawberry", "Pear", "Banana");

        Set<String> set1 = new HashSet<>(fruitList);

        Set<String> set2 = new LinkedHashSet<>(fruitList);

        System.out.println("Here are the elements in the HashSet:");
        System.out.println(set1);

        System.out.println("\nAnd here are the elements in the LinkedHashSet:");
        System.out.println(set2);
    }
}
