package ArrayQuestions;

import java.util.Scanner;

public class MatrixMultiplication {
	
	static void multiply(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2)
	{

		if(c1 != r2)
		{
			System.out.println("Wrong Dimensions - Multiplication is not possible !!");
			return;
		}
		
		int[][] mul = new int[r1][c2];
		for(int i = 0; i < r1; i++)
		{
			for(int j = 0; j < c2; j++)
			{
				for(int k = 0; k < r2; k++)
				{
					// mul[i][j] = ith row of arr1 * jth col of arr2
					
					mul[i][j] += arr1[i][k] * arr2[k][j]; 
				}
			}
		}
		
		System.out.println("Multiplication of two matrices are as follows : ");
		print(mul);
	
	}
	
	
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
		
		System.out.println("Matrix 1 :-");
		print(arr1);
		System.out.println("Matrix 2 :-");
		print(arr2);
		
		multiply(arr1,r1,c1,arr2,r2,c2);
	}

}
