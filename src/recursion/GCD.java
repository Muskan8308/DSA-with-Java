package recursion;

import java.util.Scanner;

public class GCD {
	
	// 1. Brute force - approach done by myself :)
	
	static int gcd1(int m, int n)
	{
		int num = 1;
		
		for(int i = Math.min(m, n); i > 0; i--)
		{
			if((m % i == 0) && (n % i == 0))
			{
				num = i;
				break;
			}	
		}
		
		return num;
	}

	// 2. Iterative approach : Long division method
	
	static int gcd2(int m, int n)
	{
		while(m % n != 0)
		{
			int rem = m % n;
			m = n;
			n = rem;
		}
		return n;
	}
	
	
	// 3. Recursive approach - Euclid's algorithm says - gcd(m, n) = gcd(n , m % n), and gcd(m, 0) = m.
	static int gcd3(int m, int n)
	{
		if(n == 0)
			return m;
		
		return gcd3(n, m % n);
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("GCD : " + gcd1(a,b));
		System.out.println("GCD : " + gcd2(a,b));
		System.out.println("GCD : " + gcd3(a,b));

	}

}
