import java.util.*;

public class HashSetDemo2 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Chris", "David", "Katherine", "Kenny");
        Set<String> nameSet = new HashSet<>(nameList);

        Iterator<String> it = nameSet.iterator();

        System.out.println("Here are the names in teh set.");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println();

        // Search for "Katherine". We should find this name in the set.
        if (nameSet.contains("Katherine"))
        {
            System.out.println("Katherine is in the set.");
        } else
        {
            System.out.println("Katherine is NOT in the set.");
        }

        // Search for "Bethany". We should not find this name in the set.
        if (nameSet.contains("Bethany"))
        {
            System.out.println("Bethany is in the set.");
        } else
        {
            System.out.println("Bethany is NOT in the set.");
        }
    }
}
