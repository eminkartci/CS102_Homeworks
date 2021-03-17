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

        System.out.println(numberOfMacsSold + " macs sold.");
    }

    public void setExchangeRate(float newRate){
        this.exchangeRate = newRate;

        System.out.println("The exchange rate is changed !!");
        System.out.println("The exchange rate: 1 USD = "+ newRate + " TL");
    }

    public float getRevenue(){
        return this.macPrice * this.soldMacCount;
    }
    

}