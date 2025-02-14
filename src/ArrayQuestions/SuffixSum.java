// Q. Making the array in which every element will have the sum of their next elements i.e suffix 	             	  sum.

package ArrayQuestions;
import java.util.Scanner;

public class SuffixSum {
	
	static void findSuffixSum(int []arr)
	{
		for(int i = arr.length-2; i >= 0; i--)
		{
			arr[i] = arr[i] + arr[i+1];
		}
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("\nEnter the elements of the array : ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		findSuffixSum(arr);
		System.out.print("\n Suffix sum of every element : ");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
