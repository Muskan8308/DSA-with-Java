package ArrayQuestions;
import java.util.Scanner;

public class TransposeMatrix {
	
//	1st way using extra memory and is valid for both square and non-square matrices. 
	static void transposingArray1(int[][] arr, int r, int c)
	{
		int trans[][] = new int[c][r];		// before : r x c -> after transpose : c x r
		for(int i=0; i<r; i++)
		{
			for(int j=0; j< c; j++)
			{
				trans[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Transpose of the matrix : ");
		print(trans);
	}
	
//	2nd way using in-place algorithm and is only valid for square matrices.
	
	static void transposingInplace(int[][] arr, int r, int c)
	{
		for(int i=0; i<c; i++)
		{
			for(int j=i; j<r; j++)
			{
				// swap
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		System.out.println("Transpose of the matrix : ");
		print(arr);
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
		
		//transposingArray1(arr1,r1,c1);
		transposingInplace(arr1, r1, c1);
	}

}
