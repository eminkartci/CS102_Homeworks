# Homeworks

This repository contains the CS102 homeworks.

## CS 102 – Homework 01
```
The deadline for this homework is Monday 22nd of March 23:59:00.
``` 
In this assignment you will implement an AppleStore class. Please also read the submission instructions at the end of this document very carefully. There will be no exception to these rules.


1.  An AppleStore sells only MacBook therefore the AppleStore class has the following fields: storeName, exchangeRate, macCost, macPrice and soldMacCount. (Use this ordering of fields in your function calls if you need to use multiple function arguments).
2. storeName is the name of the store. An example can be “Zorlu Apple Store”.
3. This AppleStore class will be used in Apple Stores in Turkey. An AppleStore has its prices in US Dollars. For example, macCost is the manufacturing cost of a MacBook including all necessary taxes. macPrice is the customer price of a MacBook. Both macCost and macPrice is in US dollars. Difference between these two is the earned profit of a
MacBook.
4. Apple Stores in Turkey only accepts credit card (no cash) and all their earnings are kept
in Turkish banks in Turkish Liras. Therefore, the amount to be earned will be converted to Turkish Liras by using the current exchange rate which is kept in exchangeRate field as soon as the customer’s credit card is swiped in order to complete the sale.
5. soldMacCount is the number of macs sold.
6. Implement a constructor for this class. Initially the soldMacCount is 0 and the exchange rate is also set to 7.5 Turkish Liras for 1 US Dollars. Therefore, no need to get an initial value for these fields from the user. As customers visit the store and buy macs soldMacCount will increase. The constructor does not output anything to the console.
```Java
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
```
7. Implement a sellMacs function which takes the number of macs sold to a customer as a function argument. This function outputs a line “NumberOfMacsSold macs sold”. An example is shown below.
```Java
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
```
8. Implement a setExchangeRate function to update the exchange rate from US Dollars to Turkish Liras. This function takes the TL equivalent of a US Dollar. This function also outputs 2 lines in the following format.
```          
The exchange rate has been changed!
The exchange rate: 1 USD = NewRate TL
```
```Java
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
```
9. You will only use these above methods to modify the exchangeRate and soldMacCount.
Think about what other type of set functions you may need and implement them.
```Java
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
```
10. Implement a getRevenue function which returns the total revenue of the store. Revenue is the gross income. Revenue of just one MacBook is its price. This function does not
print any output.
```Java
// calculate and return gross  revenue
    private float getRevenue(){
        // Revenue = Unit Price * Sales Volume
        return (this.macPrice * this.soldMacCount) * this.exchangeRate;
    }

```
11. Implement a getProfit function which returns the total profit of the store. Profit is the
remaining amount after subtracting the costs from the income. This function does not print any output.
 ```Java
    // calculate and return profit of the store
    private float getProfit(){
        // Profit = Revenue - Unit Cost * Sales Volume
        return this.getRevenue() - (this.macCost * this.soldMacCount) * this.exchangeRate;
    }
    
 ```
12. Implement a toString method for printing all the information about an AppleStore object. An example output of a toString method is as shown below.
```
    Apple Store Name: Zorlu Apple Store
    The cost of a MacBook: 1200.0 USD
    The price of a MacBook: 1500.0 USD
    The exchange rate: 1 USD = 7.5 TL
```
```Java
  
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
```
13. Implement a printStoreFinancials method for printing all the financial information of an AppleStore object. This function does not return anything. An example output of the
printStoreFinancials method is as shown below.
``` 
Total number of macs sold: 10 
Total revenue: 112500.0 TL
Total profit: 22500.0 TL
```
```Java

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

```
14. Feel free to add any useful class instance (member variable) to your class and/or implement any needed functions.
```Java
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
```
15. An example output of the program is provided below. In this program o AnAppleStoreobjectiscreated.
o Theobjectisprintedtotheconsole.
o sellMacsfunctioniscalledtwicewithparameters10and5.
o printStoreFinancialsfunctioniscalled.
o setExchangeRatefunctioniscalledwithparameter5.
```Java
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
```
```
Apple Store Name: Zorlu Apple Store 
The cost of a Macbook: 1200.0 USD 
The price of a MacBook: 1500.0 USD 
The exchange rate: 1 USD = 7.5 TL 
10 macs sold
5 macs sold
Total number of macs sold: 15
Total revenue: 168750.0 TL
Total profit: 33750.0 TL
The exchange rate has been changed! The exchange rate: 1 USD = 8.0 TL
```


### Submission Instructions:
• Create a branch called “homework01” in your repository. Do not work on master branch.
• Commit solutions to each of the steps to your homework01 branch.
• Once you’re finished, please create a merge request and ask for a review from
Berkay Bayram.
• You have to submit the link to your merge request via LMS in order to complete
the assignment.
