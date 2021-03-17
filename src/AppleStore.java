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

    public AppleStore(String storeName,float macCost,float macPrice,int macStock){
        this.storeName      = storeName;
        this.exchangeRate   = (float) 7.5;
        this.macCost        = macCost;
        this.macPrice       = macPrice;
        this.soldMacCount   = 0;
        this.macStock       = macStock;
    }

    // Another constructor
        // If mac stock is not defined
        // Defalut value is 100 units
    public AppleStore(String storeName,float macCost,float macPrice){
        this(storeName, macCost, macPrice, 100); 
    }

    public void sellMacs(int numberOfMacsSold){

        if (this.checkMacsSold(numberOfMacsSold)){
            this.soldMacCount += numberOfMacsSold;
            System.out.println(numberOfMacsSold + " macs sold.");
        }else {
            System.out.println("The stock is limited: " + this.macStock);
            System.out.println("The number of macs sold " + numberOfMacsSold + " is not valid! Try again !!");
        }
    }

    public void setExchangeRate(float newRate){

        if (this.checkExchangeRate(newRate)){

            this.exchangeRate = newRate;

            System.out.println("\nThe exchange rate is changed !!");
            System.out.println("The exchange rate: 1 USD = "+ newRate + " TL");
        }else {
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

        String AppleStoreContent = "\n     ---------------> Apple Store <---------------\n"+
                                   " | Apple Store Name         : "+ this.storeName     +"\n"+
                                   " | The Cost of a MacBook    : "+ this.macCost       +"\n"+
                                   " | The Price of a MacBook   : "+ this.macPrice      +"\n"+
                                   " | The Excahnge Rate        : 1 USD = "+this.exchangeRate+" TL\n";


        return AppleStoreContent;
    }

    // Print financial statements
    public void printStoreFinancials(){
        System.out.println("\nTotal Number of Macs Sold: "    +this.soldMacCount );
        System.out.println("Total Revenue: "                +this.getRevenue() );
        System.out.println("Total Profit: "                 +this.getProfit() );
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

    public void saveStoreAsTxt(){

        try {
            FileWriter myWriter = new FileWriter(new File(this.storeName.replace(' ', '_')+".txt"));
            myWriter.write(this.toString());
            myWriter.close();
            System.out.println("The store is successfully saved.");
          } catch (IOException e) {
            System.out.println("A problem occured while saving the store!!");
            e.printStackTrace();
          }

    }

}