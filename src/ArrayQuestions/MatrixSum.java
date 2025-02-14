package ArrayQuestions;
import java.util.Scanner;

public class MatrixSum {

	static void print(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
	        System.out.println();
		}
	}
	
	
	static void sum(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2)
	{
		if(r1 != r2 || c1 != c2)
		{
			System.out.println("Invalid input - Addition is not possible !!");
			return;
		}
		
		int[][] sum = new int[r1][c1];
		for(int i = 0; i < r1; i++)
		{
			for(int j = 0; j < c1; j++)
			{
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println(" Addition of two matrices are as follows : ");
		print(sum);
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and cols of matrix 1 : ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int[][] arr1 = new int[r1][c1];
        System.out.println("Enter elements for matrix 1 :");
		for(int i = 0; i < r1; i++)
		{
			for(int j = 0; j < c1; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.print("Enter the number of rows and cols of matrix 2 : ");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int[][] arr2 = new int[r2][c2];
		System.out.println("Enter elements for matrix 2 :");
		for(int i = 0; i < r2; i++)
		{
			for(int j = 0; j < c2; j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
		
		sum(arr1,r1,c1,arr2,r2,c2);
		
		
		
	}

}
