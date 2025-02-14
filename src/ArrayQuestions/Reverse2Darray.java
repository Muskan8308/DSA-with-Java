package ArrayQuestions;

import java.util.Scanner;

public class Reverse2Darray {

	// 1 way using extra memory.....
	static void reverseArray(int[][] arr, int r, int c)
	{
		int[][] nums = new int[r][c];
		
		for(int i = 0; i < r; i++)
		{
			int k = 0;
			for(int j = c-1 ; j >= 0; j--)
			{
				nums[i][k++] = arr[i][j];
			}
		}
		
		System.out.println("Reverse of the array : ");
		print(nums);
	}
	
	// 2nd way using inplace algorithm.....
	static void inplaceArray(int[][] arr, int r, int c)
	{
		for(int i = 0; i < r; i++)
		{
			int k = c-1;
			for(int j = 0; j < c/2; j++)
			{
				swap(arr,i,j,k);
				k--;
			}
		}
		
		System.out.println("Reverse of the array : ");
		print(arr);
	}
	
	
	static void swap(int[][] arr, int i, int j, int k)
	{
		int temp = arr[i][j];
		arr[i][j] = arr[i][k];
		arr[i][k] = temp;
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
		
		System.out.print("Enter the number of rows and cols of matrix : ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int[][] arr1 = new int[r1][c1];
        System.out.println("Enter elements for matrix :");
		for(int i = 0; i < r1; i++)
		{
			for(int j = 0; j < c1; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		
		//reverseArray(arr1,r1,c1);
		inplaceArray(arr1,r1,c1);
	}

}
