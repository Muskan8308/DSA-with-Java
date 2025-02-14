package ArrayQuestions;

import java.util.Scanner;

public class SpiralOrder {
	
	
	static void printSpiralOrder(int[][] arr, int r, int c)
	{
		int topRow = 0, bottomRow = r-1;
		int rightCol = c-1, leftCol = 0; 
		int totalEle = 0;
		
		while(totalEle < r*c)
		{
			// topRow -> leftCol to rightCol
			
			for(int j = leftCol ; j <= rightCol && totalEle < r*c; j++)
			{
				System.out.print(arr[topRow][j]+" ");
				totalEle++;
			}
			topRow++;
			
			// rightCol -> topRow to bottomRow
			
			for(int i = topRow; i <= bottomRow && totalEle < r*c; i++)
			{
				System.out.print(arr[i][rightCol] + " ");
				 totalEle++;
			}
			rightCol--;
			
			// bottomRow -> rightCol to leftCol
			
			for(int j = rightCol; j >= leftCol && totalEle < r*c; j--)
			{
				System.out.print(arr[bottomRow][j] + " ");
				 totalEle++;
			}
			bottomRow--;
			
			// leftCol -> bottomRow to topRow
			
			for(int i = bottomRow; i >= topRow && totalEle < r*c; i--)
			{
				System.out.print(arr[i][leftCol] + " ");
				 totalEle++;
			}
			leftCol++;
		}
		
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
		
		System.out.print("Enter the number of rows and cols of matrix : ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int[][] arr1 = new int[r1][c1];
        System.out.println("Enter " + r1*c1 + " elements for matrix :");
		for(int i = 0; i < r1; i++)
		{
			for(int j = 0; j < c1; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Spiral Order : -");
		printSpiralOrder(arr1, r1, c1);
		

	}
}
