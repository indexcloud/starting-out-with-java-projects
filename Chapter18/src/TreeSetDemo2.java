import java.util.*;

public class TreeSetDemo2 {
    public static void main(String[] args)
    {
        SortedSet<Car> carSet = new TreeSet<>(new CarComparator());

        carSet.add(new Car("227H54", "1997 Volkswagen"));
        carSet.add(new Car("453B55", "2007 Porsche"));
        carSet.add(new Car("177R60", "1980 BMW"));
        carSet.add(new Car("448A69", "1965 Mustang"));

        System.out.println("Here are the cars sorted in order of their VINs:");
        for (Car car : carSet)
        {
            System.out.println(car);
        }
    }
}
