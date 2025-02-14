package ArrayQuestions;

import java.util.Scanner;

public class PascalTriangle {
	
	
	static int[][] pascal(int n)
	{
		int[][] ans = new int[n][];
		
		for(int i = 0; i < n; i++)
		{
			ans[i] = new int[i+1];		// ith row will have i+1 columns
			
			ans[i][0] = ans[i][i] = 1;	// First and last element of every row will be 1.
			
			for(int j = 1; j < i; j++)
			{
				ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
			}
		}
		return ans;
	}
	
	
	static void print(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows for Pascal's Triangle : ");
		int n = sc.nextInt();
		int[][] arr = pascal(n);
        
		System.out.println("Here is the PASCAL'S TRIANGLE :- ");
		print(arr);
	}

}
