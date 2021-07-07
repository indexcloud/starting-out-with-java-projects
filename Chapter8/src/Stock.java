/**
 * The Stock class holds data about a stock.
 */

public class Stock {
    private String symbol;
    private double sharePrice;

    /**
     * Constructor
     * @param sym The stock's trading symbol.
     * @param price The stock's share price.
     */

    public Stock(String sym, double price) {
        symbol = sym;
        sharePrice = price;
    }

    public Stock(Stock object2) {
        symbol = object2.symbol;
        sharePrice = object2.sharePrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public String toString() {
        String str = "Trading symbol: " + symbol + "\nShare price: " + sharePrice;
        return str;
    }

    /**
     * The equals method compares two Stock objects.
     * @param object2 A Stock object to compare to the calling Stock object.
     * @return true if the argument object is equal to the calling object.
     */

    public boolean equals(Stock object2) {
        boolean status;

        if (symbol.equals(object2.symbol) && sharePrice == object2.sharePrice)
            status = true;
        else
            status = false;

        return status;
    }

    /**
     The copy method makes a copy of a Stock object.
     @return A reference to a copy of the calling object.
     */

    public Stock copy() {
        Stock copyObject = new Stock(symbol, sharePrice);

        return copyObject;
    }

}
