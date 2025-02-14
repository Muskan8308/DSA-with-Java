import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : " );
		int n = sc.nextInt();
		//1D array
		
		// int []arr = new int[5];			Another way to declare an array
		
		int []arr = {3,5,6,5,6};
		for(int i = 0; i < 5; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 2D array
		
		int[][] arr2 = {{3,5,6},{7,8,4},{4,6,7}};
		
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr2[i].length; j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		// 3D array 
		int [][][] arr3 = new int[2][2][3];
		// manually asigning values in array & we can do it by using for loop also like above...
		arr3[0][0][0] = 45;
		arr3[0][0][1] = 55;
		arr3[0][1][0] = 75;
		
		// Taking input from user
		
		
		int[] nums = new int[n];
		System.out.println("Enter "+n+" elememts :-");
		for(int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(nums[i]+" ");
		}
		
		
		
	}

}
