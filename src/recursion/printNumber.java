package recursion;
import java.util.Scanner;

public class printNumber {

	// Print numbers from 1 to n
	static void printIncreasing(int n)
	{
		// Base Case
		if(n == 1)
		{
			System.out.println(1);
			return;
		}
		
		// Recursive Work
		printIncreasing(n-1);
		
		// Self work
		System.out.println(n);
		
	}
	
	
	// Print natural numbers from n to 1
	
	static void printDecreasing(int n)
	{
		// Base Case
		if(n == 1)
		{
			System.out.println(1);
			return;
		}
		
		// Self work
		System.out.println(n);
		
		// Recursive Work
		printDecreasing(n-1);
	}
	


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		//printIncreasing(n);
		printDecreasing(n);

	}

}
