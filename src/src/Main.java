package src;

public class Main {

    public static void main(String[] args){

        AppleStore store1 = new AppleStore("Zorlu Apple Store",1200,1500);

        System.out.println(store1.toString());

        store1.sellMacs(10);

        store1.sellMacs(5);

        store1.printStoreFinancials();

        store1.setExchangeRate(8);

    }
    
}
