package ArrayQuestions;
import java.util.*;

public class RotatedArrayBy90 {
	
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
	
	static void transposeMatrix(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	
	
	static void reverse(int[] arr)
	{
		int i = 0, j = arr.length-1;
		while(i < j)
		{
			int temp =  arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++; j--;
		}
		
	}
	
	
	static void rotateArray(int[][] arr)
	{
		transposeMatrix(arr);
		
		for(int i = 0; i < arr.length; i++)
		{	
			reverse(arr[i]);
		}
		print(arr);
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
		
		System.out.println("Rotated array by 90 deg :- "); 
		
		rotateArray(arr1);
		
	}

}
