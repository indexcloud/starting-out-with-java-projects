import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Carlos", "Debby"};

        ArrayList<String> nameList = new ArrayList<>();
        for (String name : names) {
            nameList.add(name);
        }

        // Use forEach with lambda expression to print.
        nameList.forEach(x -> {System.out.printf("%s %d\n", x, x.length());});
    }
}
