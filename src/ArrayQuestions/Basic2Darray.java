package ArrayQuestions;
import java.util.Scanner;

public class Basic2Darray {
	
	static void print(int[][] arr)
	{
// To print		
		for(int i=0; i < arr.length; i++)
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
		
// 1 way
		int arr1[][] = { {3,4,5}, {3, 6 ,9}, {2,1,7} };
		print(arr1);
		
// 2nd way
        
		
		System.out.print("Enter no. of rows : ");
		int r = sc.nextInt();
		
        System.out.print("\nEnter no. of columns : ");
        int c = sc.nextInt();
        
		int arr2[][] = new int[r][c];

// To take input from user
		System.out.println("Enter elements : ");
		for(int i=0; i < arr2.length; i++)		// i < r
		{
			for(int j = 0; j < arr2[i].length; j++)		// j < c
			{
				arr2[i][j] = sc.nextInt();
			}
		}
		
		print(arr2);
	}

}
