/**
 * The Car class stores a VIN (Vehicle Identification Number) and a description for a car.
 */

public class Car {
    private String vin;
    private String description;

    /**
     * Constructor
     * @param v The VIN for the car.
     * @param desc The description of the car.
     */
    public Car(String v, String desc)
    {
        vin = v;
        description = desc;
    }

    /**
     * getVin method
     * @return The Car's VIN.
     */
    public String getVin()
    {
        return vin;
    }

    /**
     * getDescription method
     * @return The car's description.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * toString method
     * @return A string containing the VIN and description.
     */
    public String toString()
    {
        return "VIN:" + vin + "\tDescription:" + description;
    }

    /**
     * hashCode method
     * @return A hash code for this car.
     */
    public int hashCode()
    {
        return vin.hashCode();
    }

    /**
     * equals method
     * @param obj Another object to compare this object to.
     * @return true is the two objects are equal, false otherwise.
     */
    public boolean equals(Object obj)
    {
        // Make sure the other object is a Car.
        if (obj == null || !(obj instanceof Car))
            return false;
        else
        {
            Car tempCar = (Car) obj;
            return vin.equalsIgnoreCase(tempCar.vin);
        }
    }
}






