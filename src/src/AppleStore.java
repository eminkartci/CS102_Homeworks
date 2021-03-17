package src;

public class AppleStore{

    private String storeName;   // AppleStore name in Turkey like Zorlu Apple Store
    private float exchangeRate; // Dollar / TL Exchange Rate
    private float macCost;      // Mac Cost in dollars - including taxes
    private float macPrice;     // Mac price in dollars
    private int soldMacCount;

    public AppleStore(String storeName,float macCost,float macPrice){
        this.storeName      = storeName;
        this.exchangeRate   = (float) 7.5;
        this.macCost        = macCost;
        this.macPrice       = macPrice;
        this.soldMacCount   = 0;
    }

    public void sellMacs(int numberOfMacsSold){
        this.soldMacCount += numberOfMacsSold;
        System.out.println(numberOfMacsSold + " macs sold.");
    }

    public void setExchangeRate(float newRate){
        this.exchangeRate = newRate;

        System.out.println("\nThe exchange rate is changed !!");
        System.out.println("The exchange rate: 1 USD = "+ newRate + " TL");
    }

    // calculate and return gross  revenue
    public float getRevenue(){
        // Revenue = Unit Price * Sales Volume
        return (this.macPrice * this.soldMacCount) * this.exchangeRate;
    }

    // calculate and return profit of the store
    public float getProfit(){
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

}