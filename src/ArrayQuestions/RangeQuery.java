// Q. Given an array of integers of size n. Answer q queries where you need to print the sum of 	     	  values in a given range of indices from l to r (both included).
// NOTE : The values of l and r in queries follow 1-based indexing.

package ArrayQuestions;
import java.util.*;

public class RangeQuery {
	
	
	static int[] prefixSumArray(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			arr[i] += arr[i-1];
		}
		return arr;
	}
	
	
	static void print(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n+1];
		
		System.out.print("\nEnter the elements of the array : ");
		for(int i = 1; i <= n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int[] prefSum = prefixSumArray(arr); 
		
		System.out.print("Enter the number of queries : ");
		int q = sc.nextInt();
		
		while(q-- > 0)
		{
			System.out.print("\nEnter the range : ");
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			int ans = prefSum[r] - prefSum[l-1];
			
			System.out.print("Sum of elements, indexed from " + l +" to "+r+ " : "+ ans);

		}
	}

}
