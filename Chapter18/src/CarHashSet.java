import java.util.*;

public class CarHashSet {
    public static void main(String[] args)
    {
        Set<Car> carSet = new HashSet<>();

        carSet.add(new Car("227H54", "1997 Volkswagen"));
        carSet.add(new Car("448A69", "1965 Mustang"));
        carSet.add(new Car("453B55", "2007 Porsche"));
        carSet.add(new Car("177R60", "1980 BMW"));

        System.out.println("Here are the cars in the set:");
        for (Car c : carSet)
        {
            System.out.println(c);
        }

        System.out.println();

        Car mustang = new Car("448A69", "1965 Mustang");
        System.out.println("Searching for" + mustang);
        if (carSet.contains(mustang))
        {
            System.out.println("The Mustang is in the set.");
        } else
        {
            System.out.println("The Mustang is NOT in the set.");
        }

        Car plymouth = new Car("911C87", "2000 Plymouth");
        System.out.println("Searching for" + plymouth);
        if (carSet.contains(plymouth))
        {
            System.out.println("The Plymouth is in the set.");
        } else
        {
            System.out.println("The Plymouth is NOT in the set.");
        }
    }
}



