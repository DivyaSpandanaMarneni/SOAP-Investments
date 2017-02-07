package model;


/**
 * This is a model class for Stock values
 * The properties are latestPrice and previousPrice
 */
public class Stock {

    private double latestPrice;
    private double previousPrice;

    //default constructor
    public Stock(){
        this.latestPrice = -1;
        this.latestPrice = -1;
    }

    //Parameterized constructor
    public Stock(double latestPrice, double previousPrice){
        this.latestPrice = latestPrice;
        this.previousPrice = previousPrice;
    }

    //Getters and Setters for class attributes
    public double getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(double latestPrice) {
        this.latestPrice = latestPrice;
    }

    public double getPreviousPrice() {
        return previousPrice;
    }

    public void setPreviousPrice(double previousPrice) {
        this.previousPrice = previousPrice;
    }


}
