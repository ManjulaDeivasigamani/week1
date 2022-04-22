package week1.day1;

public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		
       // initialize 3 int variables (Tip: range = 8, firstNum = 0, secondNum = 1, sum in the series)
		
		int firstNum = 0;
		int secondNum = 1;
		int range = 8;
				
	
		// Iterate from 1 to the range
		for (int i = 1; i<=range; i++)
		{
		// Print first number
			System.out.println(firstNum);
		// add first and second number assign to sum
		int sum = firstNum+secondNum;
		// Assign second number to the first number
			firstNum = secondNum;
		// Assign sum to the second number
		     secondNum = sum; 	
		    				
		}
			}
}
