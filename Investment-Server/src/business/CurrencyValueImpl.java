package business;


import net.webservicex.ConversionRate;
import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

/**
 * This class services as the Business Logic for retrieving the value in a different currency
 */
public class CurrencyValueImpl {

    //to convert the currency from one currency to another
    public double getCurrencyValue(String fromCurrency, String toCurrency){
        CurrencyConvertor currencyConvertor = new CurrencyConvertor();
        CurrencyConvertorSoap currencyConvertorSoap = currencyConvertor.getCurrencyConvertorSoap();

        //creating the currecy class enum objects
        Currency srcCurrencyObj = Currency.fromValue(fromCurrency.toUpperCase());
        Currency targetCurrencyObj = Currency.fromValue(toCurrency.toUpperCase());

        ConversionRate conversionRate = new ConversionRate();
        conversionRate.setFromCurrency(srcCurrencyObj);
        conversionRate.setToCurrency(targetCurrencyObj);

        //Retrieving the converted result
        Double coversionResult = currencyConvertorSoap.conversionRate(srcCurrencyObj, targetCurrencyObj);



        return coversionResult;
    }//end of getCurrencyValue method


}//end of class
