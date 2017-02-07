package business;


import net.webservicex.GetQuote;
import net.webservicex.StockQuote;
import net.webservicex.StockQuoteSoap;
import model.Stock;

/**
 * This class serves as business logic for retrieving the latest previous stock values of a given company.
 * The methods of this class are invoked by MoveInvestment Service to get the necessary details
 */
public class StockValueImpl {

    public static String getLastQuote(String input){//for gettign the last price of the stock from the given XML Result
        String lastQuote = null;

        String startTag = "<Last>";
        String endTag = "</Last>";
        int startIndex, endIndex;
        startIndex = input.indexOf(startTag) + startTag.length();
        endIndex = input.indexOf(endTag) ;

        lastQuote = input.substring(startIndex,endIndex);

        return lastQuote;

    }//end of getLastQuote

    public static String getPreviousClose(String input){//for gettign the previous stock price from the given XML Result

        String previousClose = null;

        String startTag = "<PreviousClose>";
        String endTag = "</PreviousClose>";
        int startIndex, endIndex;
        startIndex = input.indexOf(startTag) + startTag.length();
        endIndex = input.indexOf(endTag) ;

        previousClose = input.substring(startIndex,endIndex);



        return previousClose;


    }//end of getPreviousClose

    //getStockQuoteValue gets the stock details of given company
    public Stock getStockQuoteValue(String company){

        StockQuote stockQuote = new StockQuote(); //Object of StockQuote class
        StockQuoteSoap stockQuoteSoap = stockQuote.getStockQuoteSoap();//Instantiation of StockQuoteSoap

        GetQuote getQuote = new GetQuote();
        getQuote.setSymbol(stockQuoteSoap.getQuote(company));//Invoking getQuote method to retrieve the stock details of given company

        String result = getQuote.getSymbol();

        double lastQuote = Double.parseDouble(getLastQuote(result));
        double previousQuote = Double.parseDouble(getPreviousClose(result));


        Stock stock = new Stock();

        stock.setLatestPrice(lastQuote);//setting the lastQuote property of Stock object
        stock.setPreviousPrice(previousQuote);//setting the previousPrice property of Stock object


        return stock;
    }//end of method
}//end of class
