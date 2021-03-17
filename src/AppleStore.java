
// To save the store as txt file import them
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppleStore{

    private String storeName;   // AppleStore name in Turkey like Zorlu Apple Store
    private float exchangeRate; // Dollar / TL Exchange Rate
    private float macCost;      // Mac Cost in dollars - including taxes
    private float macPrice;     // Mac price in dollars
    private int soldMacCount;
    private int macStock;       // Amount of mac that store can sell

    // Main Consturcor
        // Get:
            // Store Name
            // Mac Cost
            // Mac Price
            // Stock
    public AppleStore(String storeName,float macCost,float macPrice,int macStock){
        this.storeName      = storeName;
        this.exchangeRate   = (float) 7.5; // Default 7.5
        this.macCost        = macCost;
        this.macPrice       = macPrice;
        this.soldMacCount   = 0;            // Default 0
        this.macStock       = macStock;     // Default 100
    }

    // Another constructor
        // If mac stock is not defined
        // Defalut value is 100 units
    public AppleStore(String storeName,float macCost,float macPrice){
        this(storeName, macCost, macPrice, 100); 
    }

    // Sell Macs
    public void sellMacs(int numberOfMacsSold){
        // Check if stock is enough or the number is valid
        if (this.checkMacsSold(numberOfMacsSold)){
            // increase the sold count
            this.soldMacCount += numberOfMacsSold;
            // inform the user
            System.out.println(numberOfMacsSold + " macs sold.");
        // Otherwise
        }else {
            // inform the user
            System.out.println("The stock is limited: " + this.macStock);
            System.out.println("The number of macs sold " + numberOfMacsSold + " is not valid! Try again !!");
        }
    }

    public void setExchangeRate(float newRate){
        // check if the rate is valid
        if (this.checkExchangeRate(newRate)){
            // set the non-primitive variable
            this.exchangeRate = newRate;
            // inform
            System.out.println("\nThe exchange rate is changed !!");
            System.out.println("The exchange rate: 1 USD = "+ newRate + " TL");
        // OW
        }else {
            // inform 
            System.out.println("The given exchange rate: " + newRate + " is not valid! Try again !!");
        }
        
    }

    // calculate and return gross  revenue
    private float getRevenue(){
        // Revenue = Unit Price * Sales Volume
        return (this.macPrice * this.soldMacCount) * this.exchangeRate;
    }

    // calculate and return profit of the store
    private float getProfit(){
        // Profit = Revenue - Unit Cost * Sales Volume
        return this.getRevenue() - (this.macCost * this.soldMacCount) * this.exchangeRate;
    }
    
    
    public String toString(){
        // initialize a string 
        String AppleStoreContent = "\n     ---------------> Apple Store <---------------\n"+
                                   " | Apple Store Name         : "+ this.storeName     +"\n"+
                                   " | The Cost of a MacBook    : "+ this.macCost       +"\n"+
                                   " | The Price of a MacBook   : "+ this.macPrice      +"\n"+
                                   " | The Excahnge Rate        : 1 USD = "+this.exchangeRate+" TL\n";

        // return it
        return AppleStoreContent;
    }

    // Print financial statements
    public void printStoreFinancials(){
        // Print to the screen
        System.out.println("\nTotal Number of Macs Sold: "    +this.soldMacCount );
        System.out.println("Total Revenue: "                +this.getRevenue() );
        System.out.println("Total Profit: "                 +this.getProfit() );
    }

    // return financial statements
    public String toStringStoreFinancials(){
        // initialize a string
        String financialContent =   "\n\nTotal Number of Macs Sold: "    +this.soldMacCount
                                    +"\nTotal Revenue: "                +this.getRevenue()
                                    +"\nTotal Profit: "                 +this.getProfit();
        // return it
        return financialContent;
    }


    // additional functions
    private boolean checkExchangeRate(float exchangeRate){
        // if rate is not 0 or negative
        if (exchangeRate > 0){
            // return true
            return true;
        }

        // otherwise false
        return false;
    }

    private boolean checkMacsSold(float soldMacCount){
        // if rate is not 0 or negative
        // And less than stock amount
        if (soldMacCount > 0 && soldMacCount <= this.macStock){
            // return true
            return true;
        }

        // otherwise false
        return false;
    }

    // save store as txt file
    public void saveStoreAsTxt(){
        // use try catch
        try {
            // create a filewriter instance
                                                // delete spaces in name instead use _
                                                // add .txt extension
            FileWriter myWriter = new FileWriter(new File(this.storeName.replace(' ', '_')+".txt"));

            // Write to the file
            myWriter.write(this.toString());
            myWriter.write(this.toStringStoreFinancials());
            myWriter.write("\n\nAll Rights Reserved @2021 Emin Kartci");
            // Close the file properly
            myWriter.close();

            // inform
            System.out.println("The store is successfully saved.");

        // If any problem occurs
          } catch (IOException e) {

            // inform
            System.out.println("A problem occured while saving the store!!");
            e.printStackTrace();
          }

    }

}