public class Main {

    public static void main(String[] args){


        // create an AppleStore instance 
            // Store Name -> Zorlu Apple store
            // Mac Cost   -> 1200
            // Mac Price  -> 1500
        AppleStore store1 = new AppleStore("Zorlu Apple Store",1200,1500);

        // Print the infomration
        System.out.println(store1.toString());

        // Sell 10 macs
        store1.sellMacs(10);

        // Sell 5 macs more
        store1.sellMacs(5);

        // Check the financial situation
        store1.printStoreFinancials();

        // Change the exchange rate
        store1.setExchangeRate(8);

        // Save the store values
        store1.saveStoreAsTxt();

    }
    
}
