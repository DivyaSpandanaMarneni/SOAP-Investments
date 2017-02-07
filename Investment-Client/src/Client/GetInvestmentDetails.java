package Client;

/**
 * This is the client class that lets us access the service MoveInvestment
 */

import moveinvestmentservice.MoveInvestment;
import moveinvestmentservice.MoveInvestmentService;
import moveinvestmentservice.Stock;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by marne on 1/19/2017.
 */
public class GetInvestmentDetails {

    public static void main(String[] args){

        MoveInvestmentService moveInvestmentService = new MoveInvestmentService(); //Object of MoveInvestment Service
        MoveInvestment moveInvestment = moveInvestmentService.getMoveInvestmentPort();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Examples - AFA-Afghanistan Afghani, GBP-British Pound, INR-Indian Rupee, EUR-Euro, CNY-Chinese Yuan, USD-U.S. Dollar");
        System.out.println("Enter the target currency value :");
        String currency = scanner.nextLine().toUpperCase();

        Stock stock = moveInvestment.investmentValue(currency); //Invoking the method of MoveInvestment

        System.out.println("The latest value in "+currency.toUpperCase()+" for 1000 shares of all companies is: "+BigDecimal.valueOf(stock.getLatestPrice())+" "+currency);
        System.out.println("The previous value in "+currency.toUpperCase()+" for 1000 shares of all companies is: "+BigDecimal.valueOf(stock.getPreviousPrice())+" "+currency);


    }//end of  main
}//end of GetInvestmentDetails class

