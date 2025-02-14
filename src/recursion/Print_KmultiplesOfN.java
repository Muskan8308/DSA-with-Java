package recursion;

// Given a number n. Print first k multiples of n.

public class Print_KmultiplesOfN {
	
	static void print(int n, int k)
	{
		// base case
		if(k == 0)
		 return;
		
		print(n, k-1);					// recursive work
		System.out.println(n * k);		// self work
	}

	public static void main(String[] args) {

		print(5,4);

	}

}
