package ghasemia;

/**
 * Assignment 1
 *
 * Program : manage a store’s product stock.
 *
 * This is Stock class, and it consists of 6 fields, 3 constructors, and getter
 * and setter of the fields.
 *
 * @author Amirmahdi Ghasemi, October 2020
 */
public class Stock {

    // Field of variables that will use in this class
    private String productID = "111_AAA";
    private String productName = "Unknown Product";
    private int qoh = 0;
    private int rsp = 25;
    private double sellPrice = 0;
    private double buyPrice = 0;

    // This is the first constructor of Stock class
    public Stock() {
    }

    /**
     * This is the second constructor of Stock class and, it contains 3
     * parameters.
     *
     * @param givenProductID
     * @param givenProductName
     * @param givenSellPrice
     */
    public Stock(String givenProductID, String givenProductName, double givenSellPrice) {
        setProductID(givenProductID);
        setProductName(givenProductName);
        setSellPrice(givenSellPrice);
    }

    /**
     * This is the third constructor of Stock class and, it contains 6
     * parameters.
     *
     * @param givenProductID
     * @param givenProductName
     * @param givenQoh
     * @param givenRsp
     * @param givenSellPrice
     * @param givenBuyPrice
     */
    public Stock(String givenProductID, String givenProductName,
            int givenQoh, int givenRsp, double givenSellPrice, double givenBuyPrice) {
        setProductID(givenProductID);
        setProductName(givenProductName);
        setQoh(givenQoh);
        setRsp(givenRsp);
        setSellPrice(givenSellPrice);
        setBuyPrice(givenBuyPrice);
    }

    /**
     * This method gets the productID that was entered by the user.
     *
     * @return productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Creates a new productID with a given productID.
     *
     * @param givenID
     */
    public void setProductID(String givenID) {
        productID = givenID;
    }

    /**
     * This method gets the productName that was entered by the user.
     *
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Creates a new productName with a given productName.
     *
     * @param givenProductName
     */
    public void setProductName(String givenProductName) {
        productName = givenProductName;
    }

    /**
     * This method gets the qoh that was entered by the user.
     *
     * @return qoh
     */
    public int getQoh() {
        return qoh;
    }

    /**
     * Creates a new qoh with a given qoh, and the only condition is the title
     * cannot be less than zero. If the qoh is less than, it will throw an
     * exception.
     *
     * @param givenQoh
     */
    public void setQoh(int givenQoh) {
        if (0 <= givenQoh) {
            qoh = givenQoh;
        } else {
            throw new IllegalArgumentException("Error: Must be greater than 0");
        }
    }

    /**
     * This method gets the rsp that was entered by the user.
     *
     * @return rsp
     */
    public int getRsp() {
        return rsp;
    }

    /**
     * Creates a new rsp with a given rsp, and the only condition is the title
     * cannot be less than zero. If the rsp is less than, it will throw an
     * exception.
     *
     * @param givenRsp
     */
    public void setRsp(int givenRsp) {
        if (0 <= givenRsp) {
            rsp = givenRsp;
        } else {
            throw new IllegalArgumentException("Sorry, the value is not a valid number.");
        }
    }

    /**
     * This method gets the sellPrice that was entered by the user.
     *
     * @return sellPrice
     */
    public double getSellPrice() {
        return sellPrice;
    }

    /**
     * Creates a new sellPrice with a given sellPrice, and the only condition is
     * the title cannot be less than zero. If the sellPrice is less than, it
     * will throw an exception.
     *
     * @param givenSellPrice
     */
    public void setSellPrice(double givenSellPrice) {
        if (0 <= sellPrice) {
            sellPrice = givenSellPrice;
        } else {
            throw new IllegalArgumentException("Error: Must be greater than 0");
        }

    }

    /**
     * This method gets the buyPrice that was entered by the user.
     *
     * @return buyPrice
     */
    public double getBuyPrice() {
        return buyPrice;
    }

    /**
     * Creates a new buyPrice with a given buyPrice, and the only condition is
     * the title cannot be less than zero. If the buyPrice is less than, it will
     * throw an exception.
     *
     * @param givenBuyPrice
     */
    public void setBuyPrice(double givenBuyPrice) {
        if (0 <= buyPrice) {
            buyPrice = givenBuyPrice;
        } else {
            throw new IllegalArgumentException("Error: Must be greater than 0");
        }
    }

    /**
     * This method is going to calculate the reStockFee, and it takes one
     * parameter.
     *
     * @param bQuantity
     */
    public double reStockFee(int bQuantity) {
        double total = bQuantity * buyPrice;
        return total;
    }

    /**
     * This toString will print the last output when it collects all the inputs
     *
     * @return the output
     */
    @Override
    public String toString() {
        return String.format(productID + " (" + productName.trim() + ")" + "," + "QOH: " + qoh + " Price: $%.2f", buyPrice);
    }

}
