import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

interface OnlineAccount { 
	int basePrice = 120; 
	int numberOfRegularMovie = 45; 
	int numberOfExclusiveMovies = 80; 
}

class Account implements OnlineAccount, comparable<Account> { 
    
    int noOfRegularMovies, noOfExclusiveMovies; 
    String ownerName;
    
    // 1) Add a parameterized constructor that initializes the attributes noofExclusiveMovies and noofExclusiveMovies.
    public Account(String owner, int noOfRegularMovies, int noOfExclusiveMovies) { 
		this.ownerName = owner; 
		this.numberOfRegularMovies = noOfRegularMovies; 
		this.numberOfExclusiveMovies = noOfExclusiveMovies; 
	} 

    // 2. This method returns the monthly cost for the account.
    public int monthlyCost() { 
		return basePrice + noOfRegularMovies * regularMoviePrice + noOfExclusiveMovies * exclusiveMoviePrice; 
	}
    
    // 3. Override the compare to method of the comparable interface such that two accounts can be compared based on their monthly cost.
    @Override 
	public int compareTo(Account account)  { 
		if(this.monthlyCost() < account.monthlyCost()) { 
			return 1; 
		} else { 
			return -1; 
		} 
	}

    // 4. Returns "Owner is [owner Name] and monthly cost is [monthly Cost] USD."
    public String toString() { 
		return "Owner is " + ownerName + " and monthly cost is " + this.monthlyCost() + " USD."; 
	}
} 

public class Solution { 
	public static void main(String [] args) { 
		Scanner sc = new Scanner(System.in); 
		String sub = sc.nextLine(); 
 
		int t = Integer.parseInt(sub); 
		ArrayList<Account> list = new ArrayList <>(); 
		for(int i=0; i < t; i++) { 
			String[] input = sc.nextLine().split(""); 
			list.add(new Account(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]))); 
		} 
 
		Collections.sort(list); 
		System.out.println("Most valuable account details:"); 
		System.out.println(list.get(list.size()-1)); 
	} 
}