package recursion;

// Printing Fibbonacci numbers and series...................
import java.util.Scanner;

public class fibbonacci {
	
	static int printFibbo(int n) 
	{
		// base case
		if(n == 0 || n == 1) return n;
		
		// recursive relation
		
		int prev = printFibbo(n-1);
		int prevPrev = printFibbo(n-2);
		
		// self work
		
		return prev + prevPrev;
	}
	

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		System.out.println(" Fibbonacci number at "+ n + "th term : " + printFibbo(n));
		
		// Now printing the whole fibbonacci series till nth term
		System.out.println("*************************************************\nFibbonacci Series :- ");
		
		for(int i = 0; i <= n; i++)
		{
			System.out.println( i + "th term : " + printFibbo(i));
		}
		
		System.out.println("**************************************************\n Again Fibbonacci Series :- ");
		
		for(int i = 0; i <= n; i++)
		{
			System.out.print(printFibbo(i)+ " ");
		}
		
	}

}
