package src;

public class AppleStore{

    private String storeName;   // AppleStore name in Turkey like Zorlu Apple Store
    private float exchangeRate; // Dollar / TL Exchange Rate
    private float macCost;      // Mac Cost in dollars - including taxes
    private float macPrice;     // Mac price in dollars
    private int soldMacCount;

    public AppleStore(String storeName,float macCost,float macPrice){
        this.storeName      = storeName;
        this.exchangeRate   = 7.5;
        this.macCost        = macCost;
        this.macPrice       = macPrice;
        this.soldMacCount   = 0;
    }

    // public AppleStore(String storeName,float macCost,float macPrice,int soldMacCount){
    //     this(storeName,8,macCost,macPrice,soldMacCount);
    // }

    // public AppleStore(String storeName,float macCost,float macPrice){
    //     this(storeName,8,macCost,macPrice,0);
    // }

}