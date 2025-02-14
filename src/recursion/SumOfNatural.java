// Given a number n . Find the sum of natural numbers till n but with alternate signs. i.e 1-2+3-4+5-...

package recursion;

public class SumOfNatural {
	
	static int soN(int n)
	{
		// base case
		if(n == 1) return 1;
		
		// recursive work
		
		int sum = 0;
		sum = soN(n-1);
		
		// self work
		if(n % 2 == 0)		// Even
			sum -= n;		// soN(n-1) - n
		else				// Odd
			sum += n;		// soN(n-1) + n
		
		return sum;	
	}

	public static void main(String[] args) {
		System.out.println(soN(10));
	}

	
	// I've done it successfully without watching any tutorial :)...!!!
}
