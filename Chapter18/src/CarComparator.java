import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2)
    {
        String vin1 = car1.getVin();
        String vin2 = car2.getVin();

        return vin1.compareToIgnoreCase(vin2);
    }
}
