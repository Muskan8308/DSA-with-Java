//Q. Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.
// Eg.  - n = 4 so elements will 1 to 16 filled in spiral order.

package ArrayQuestions;
import java.util.*;

public class GenerateSpiralMatrix {
	
	
	static int[][] generateSpiral(int n)
	{
		int topRow = 0, bottomRow = n-1;
		int leftCol = 0, rightCol = n-1;
		int curr = 1;
		int[][] arr = new int[n][n];
		
		while(curr <= n*n)
		{
				// topRow -> leftCol to rightCol
			for(int j = leftCol; j <= rightCol && curr <= n*n; j++)
			{
				arr[topRow][j] = curr++;
			}
			topRow++;
				
				// rightCol -> topRow to bottomRow
			for(int i = topRow; i <= bottomRow && curr <= n*n; i++)
			{
				arr[i][rightCol] = curr++;
			}
			rightCol--;
			
				// bottomRow -> rightCol to leftCol
			for(int j = rightCol; j >= leftCol && curr <= n*n; j--)
			{
				arr[bottomRow][j] = curr++;
			}
			bottomRow--;
			
				// leftCol -> bottomRow to topRow
			for(int i = bottomRow; i >= topRow && curr <= n*n; i--)
			{
				arr[i][leftCol] = curr++;
			}
			leftCol++;
		}
		
		return arr;
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
		
		System.out.print("Enter n : ");
		int n =sc.nextInt();
				
		int[][] matrix = generateSpiral(n);
		System.out.println("Here is the matrix which have elemnts in a spiral order :");
		print(matrix);
		
	}

}
