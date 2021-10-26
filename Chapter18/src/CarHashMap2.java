import java.util.*;

public class CarHashMap2 {
    public static void main(String[] args)
    {
        Map<String, Car> carMap = new HashMap<>();


// Create some Car objects.
        Car vw = new Car("227H54", "1997 Volkswagen");
        Car mustang = new Car("448A69", "1965 Mustang");
        Car porsche = new Car("453B55", "2007 Porsche");
        Car bmw = new Car("177R60", "1980 BMW");

        carMap.put(vw.getVin(), vw);
        carMap.put(mustang.getVin(), mustang);
        carMap.put(porsche.getVin(), porsche);
        carMap.put(bmw.getVin(), bmw);

        // Get a set containing the keys in this map.
        Set<String> keys = carMap.keySet();

        // Iterate through the keys, printing each one.
        System.out.println("Here are the keys:");
        for (String k : keys)
            System.out.println(k);

        // Get a collection containing the values.
        Collection<Car> values = carMap.values();

        System.out.println("\nHere are the values:");
        for (Car c : values)
            System.out.println(c);

    }
}
