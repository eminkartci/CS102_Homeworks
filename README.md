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
6. Implement a constructor for this class. Initially the soldMacCount is 0 and the exchange
rate is also set to 7.5 Turkish Liras for 1 US Dollars. Therefore, no need to get an initial value for these fields from the user. As customers visit the store and buy macs soldMacCount will increase. The constructor does not output anything to the console.
7. Implement a sellMacs function which takes the number of macs sold to a customer as a function argument. This function outputs a line “NumberOfMacsSold macs sold”. An example is shown below.
8. Implement a setExchangeRate function to update the exchange rate from US Dollars to Turkish Liras. This function takes the TL equivalent of a US Dollar. This function also outputs 2 lines in the following format.
          The exchange rate has been changed!
The exchange rate: 1 USD = NewRate TL
9. You will only use these above methods to modify the exchangeRate and soldMacCount.
Think about what other type of set functions you may need and implement them.
10. Implement a getRevenue function which returns the total revenue of the store. Revenue is the gross income. Revenue of just one MacBook is its price. This function does not
print any output.
11. Implement a getProfit function which returns the total profit of the store. Profit is the
remaining amount after subtracting the costs from the income. This function does not print any output.
 
12. Implement a toString method for printing all the information about an AppleStore object. An example output of a toString method is as shown below.
```
    Apple Store Name: Zorlu Apple Store
    The cost of a MacBook: 1200.0 USD
    The price of a MacBook: 1500.0 USD
    The exchange rate: 1 USD = 7.5 TL
```
13. Implement a printStoreFinancials method for printing all the financial information of an AppleStore object. This function does not return anything. An example output of the
printStoreFinancials method is as shown below.
``` 
Total number of macs sold: 10 
Total revenue: 112500.0 TL
Total profit: 22500.0 TL
```
14. Feel free to add any useful class instance (member variable) to your class and/or implement any needed functions.
15. An example output of the program is provided below. In this program o AnAppleStoreobjectiscreated.
o Theobjectisprintedtotheconsole.
o sellMacsfunctioniscalledtwicewithparameters10and5.
o printStoreFinancialsfunctioniscalled.
o setExchangeRatefunctioniscalledwithparameter5.
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
