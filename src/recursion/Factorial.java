package recursion;

import java.util.Scanner;

// Program of factorial using recursion

public class Factorial {

	static int fact(int n)
	{
		if(n == 0)
		{
//			System.out.println(1);
			return 1;
		}
		
		int pro = fact(n-1);
		
		return n*pro;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		System.out.println("Factorial is "+ fact(n));
		
	}

}
