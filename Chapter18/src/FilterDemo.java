import java.util.ArrayList;
import java.util.function.Predicate;

public class FilterDemo {
    public static void main(String[] args) {
        String [] names = {"Anna", "Bob", "Carlos", "Debby"};

        ArrayList<String> nameList = new ArrayList<>();
        for (String name : names)
        {
            nameList.add(name);
        }

        // Use forEach with lambda expression to print
        Predicate<String> filter = x -> x.length() <= 4;

        nameList.removeIf(filter);

        System.out.println(nameList);
    }
}
