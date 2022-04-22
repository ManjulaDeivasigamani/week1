package week1.day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
	// Declare an int Input and assign a value 13
		int input =14;
	// Declare a boolean variable setflag as false
		boolean setFlag = false; 
	// Iterate from 2 to half of the input
		
		for (int i=2; i<=input/2; i++)			
			
		{	
	// Divide the input with each for loop variable and check the remainder
			int remainder = input%i;	
	// Set the flag as true when there is no remainder						
			if (remainder==0)
			{
			 setFlag = true;
			 break;
			}
	// break the iterator
		}
		
	// Check the flag (Provide a condition)
		
	// Print 'Prime' when the condition matches
		if (setFlag== true)
		{
			System.out.println("not a prime number");
						
		}
		
	// Print 'Not a Prime' when the condition doesn't match 
		else
		{
			System.out.println("prime number");
		}
	}

}
