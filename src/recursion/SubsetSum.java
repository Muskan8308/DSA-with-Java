package recursion;
/*
 * Q. Print the sum of each subset of an given array.
 *  
 *  In this, we are directly passing the sum of subset rather than calculating sum using for loop at the base case, which may lead to increase complexity.
 *  This is an optimal approach than above.
	
 */

public class SubsetSum {

	
	static void subsetSum2(int[] a, int idx, int currSum)
	{
		if(idx >= a.length)
		{
			System.out.print("[" + currSum + "] ");
			return;
		}
		
		subsetSum2(a, idx+1, currSum + a[idx]);		// INCLUSION
		
		subsetSum2(a, idx+1, currSum);				// EXCLUSION
	}

	public static void main(String[] args) {

		int[] arr = {2,4,5};
		
		subsetSum2(arr, 0, 0);
	}

}
