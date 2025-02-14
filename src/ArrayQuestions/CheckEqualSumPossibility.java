// Q. Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array.


package ArrayQuestions;
import java.util.Scanner;

public class CheckEqualSumPossibility {

	static int findTotalSum(int[] arr)
	{
		int totalSum = 0;
		for(int i=0; i < arr.length; i++)
		{
			totalSum += arr[i];
		}
		return totalSum;
	}
	
	
	static boolean checkEqualSum(int[] arr)
	{
		int totalSum = findTotalSum(arr);
		int prefixSum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			prefixSum += arr[i];
			int suffixSum = totalSum - prefixSum;
			
			if(prefixSum == suffixSum)
				return true;
		}
		return false;
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
		
		boolean ans = checkEqualSum(arr);
		System.out.print("\n Is Equal sum possible : "+ ans);
		
		
	}

	
}
