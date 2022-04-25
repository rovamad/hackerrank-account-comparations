Account Comparisons 

Given an interface named "OnlineAccount" that models the account of popular online video streaming platforms, perform the operations listed below. The interface "OnlineAccount" consists of the basePrice, regular Movie Price, and exclusive Movie Price. 

In order to complete this challenge, you need to implement an incomplete class named "Account" which implements the "OnlineAccount" interface as well as the "Comparable<Account>" interface. 

Class Account has two attributes to keep track of the number of movies watched: 

1. Integer noOfRegular Movies 
2. Integer noOfExclusive Movies 
3. String ownerName 

Methods to complete for class Account: 

1. Add a parameterized constructor that initializes the attributes ownerName, numberOfRegular Movies, and numberOfExclusive Movies. 
2. double monthly Cost() => This method returns the monthly cost for the account. [Monthly Cost = base price + noOfRegular Movies regular Movie Price + noOfExclusive Movies*exclusive MoviePrice] 
3. Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost. 
4. String toString, which returns => "Owner is (ownerName) and monthly cost is [monthlyCost] USD." 

Input Format For Custom Testing

Sample Case 0 
Sample Input 
STDIN       Function Parameters 
-----       -------------------
3           n = 3
Frank 12 6  [Owner Name] [numberOfRegularMovies] [numberofExclusiveMov 
David 7 19 
Karen 14 4 

Sample Output

Most valuable account details: Owner is David and monthly cost is 1955 USD. 

Explanation 
Compares the 3 accounts and prints the details of account with most expenditure.