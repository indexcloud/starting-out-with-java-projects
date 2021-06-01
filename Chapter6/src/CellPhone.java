/**
 * The CellPhone class holds data about a cell phone.
 */

public class CellPhone {
    // Fields
    private String manufact;
    private String model;
    private double retailPrice;

    /**
     * Constructor
     * @param man The phone's manufacturer.
     * @param mod The phone's model number.
     * @param price The phone's retail price.
     */

    public CellPhone(String man, String mod, double price) {
        manufact = man;
        model = mod;
        retailPrice = price;
    }

    /**
     * The setManufact method sets the phone's manufacturer name.
     * @param man The phone's manufacturer.
     */

    public void setManufact(String man) {
        manufact = man;
    }

    /**
     * The setModel method sets the phone's model number.
     * @param mod The phone's model number.
     */

    public void setMod(String mod) {
        model = mod;
    }

    /**
     * The setRetailPrice method sets the phone's retail price.
     * @param price The phone's retail price.
     */

    public void setRetailPRice(double price) {
        retailPrice = price;
    }

    public String getManufact() {
        return manufact;
    }

    public String getModel() {
        return model;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }
}










