package recursion;

import java.util.Scanner;

public class DigitSum {
	
	int sumOfDigits(int n)
	{
		// base case
		if(n >= 0 && n <= 9)
		return n;
		
		int smallAns = sumOfDigits(n/10);
		
		return smallAns + n % 10;
		
		// return sumOfDigits(n/10) + n % 10;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		DigitSum d1 = new DigitSum();
		System.out.println(d1.sumOfDigits(n));
        System.out.println(5%10);
	}

}
