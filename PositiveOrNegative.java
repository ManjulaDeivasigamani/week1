package week1.day1;

public class PositiveOrNegative {
	public static void main(String[] args) {
		
		// Initialize a number		
		int number = -14;
		
		//If a number is positive, print "The number is positive"
		if (number>0)
				{
			System.out.println("The number is Positive");
					}
		
		//If a number is negative, print "The number is negative"
		else if (number<0)
		{
			System.out.println("The number is Negative");
		}
		// If it nether negative nor positive, print as "The number is neither positive nor negative"
		else
		{
			System.out.println("The number is neither positive nor negative");
		}
			
	}

}
