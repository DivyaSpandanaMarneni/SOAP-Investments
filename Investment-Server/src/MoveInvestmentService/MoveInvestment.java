package MoveInvestmentService;


import business.CurrencyValueImpl;
import business.StockValueImpl;
import model.Stock;

/**
 * This is  the Web Service MoveInvestment.
 * It has single method investmentValue that gets the stock value of the given 5 companies in the currency we want
 */

@javax.jws.WebService
public class MoveInvestment {

    CurrencyValueImpl currencyValue = new CurrencyValueImpl();
    StockValueImpl stockValue = new StockValueImpl();

    @javax.jws.WebMethod
    public Stock investmentValue(String currencyCode){

        String[] companyNames = {"IBM","AAPL","HD","BA","KO"}; //List of the 5 companies - IBM, Apple, Boeing, Coca-Cola and Home-Depot
        double[] latestValue = new double[5];//for storing the latest stock price
        double[] previousValue = new double[5];//for storing the previous stock price



        Stock stock = new Stock();
        for (int i=0;i<companyNames.length;i++){
            try {
                stock = stockValue.getStockQuoteValue(companyNames[i]); //getting the stock class object with latest and previous values

                latestValue[i] = stock.getLatestPrice();// stockValue.getStockQuoteValue(companyNames[i]).getLatestPrice();
                System.out.println("Latest stock value of "+companyNames[i]+" is : "+latestValue[i]+" USD");
                previousValue[i] = stock.getPreviousPrice(); //stockValue.getStockQuoteValue(companyNames[i]).getPreviousPrice();
            }
            catch (Exception e){ //in case if any number format exceptions arise
                latestValue[i] = 0;
                previousValue[i] =0;
                System.out.println("N/A number format exception occured for "+companyNames[i]);
            }
        }

        double finalLatestValue = 0,finalPreviousValue =0;
        for (int i = 0;i<latestValue.length;i++){
            finalLatestValue = finalLatestValue + latestValue[i]; //adding the latest value of all companies
            finalPreviousValue = finalPreviousValue + previousValue[i]; //adding the previous value of all companies
        }

        double investmentValue = currencyValue.getCurrencyValue("USD",currencyCode.toUpperCase());//getting conversion value from USD to target currency
        stock.setLatestPrice(finalLatestValue*investmentValue*1000);//latest value of all stocks in the given currency
        stock.setPreviousPrice(finalPreviousValue*investmentValue*1000);//previous value



        return stock; // returning the stock class object
    }


}

