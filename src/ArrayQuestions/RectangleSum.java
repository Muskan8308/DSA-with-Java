package ArrayQuestions;
import java.util.*;

public class RectangleSum {
	
	// 1. Brute Force Approach 
	 static int findRectangleSum1(int[][] arr, int l1, int r1, int l2, int r2)
	 {
		 int sum = 0;
		 for(int i = l1; i <= l2; i++)
		 {
			 for(int j = r1; j <= r2; j++)
			 {
				 sum += arr[i][j];
			 }
		 } 
		 return sum;
	 }
	
	  
	 // 2. Using PrefixSum Approach 
	 
	 static int findRectangleSum2(int[][] arr, int l1, int r1, int l2, int r2)
	 {
		 int sum = 0;
		 findPrefixSum(arr);
		 
		 for(int i = l1; i <= l2; i++)
		 {
			 if(r1 >= 1)
				 sum += arr[i][r2] - arr[i][r1-1];
			 else
				 sum += arr[i][r2];
		 } 
		 return sum;
	 }
	 
	 static void findPrefixSum(int[][] arr)
	 {
		 // traverse horizontally to calculate row wise sum

		 int r = arr.length;
		 int c = arr[0].length;			// Only valid when r > 0 otherwise it will error.
		 
		 for(int i = 0; i < r; i++)
		 {
			 for(int j = 1; j < c; j++)
			 {
				 arr[i][j] += arr[i][j-1]; 
			 }
		 } 
	 }
	 
	 
	 // 3. Calculating Prefix sum over both rows and columns Approach
	 // Best time complexity
	 
	 static int findRectangleSum3(int[][] arr, int l1, int r1, int l2, int r2)
	 {
		 findPrefix(arr);
		 
		 int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0; 
		 
		 sum = arr[l2][r2];
		 if(l1 >= 1)
			 up = arr[l1-1][r2]; 
		 if(r1 >= 1)
			 left = arr[l2][r1-1]; 
		 if(r1 >= 1 && l1 >= 1)
			leftUp = arr[l1-1][r1-1]; 
		 
		 ans = sum - up - left + leftUp;
		 
		 return ans;
	 }
	 
	 static void findPrefix(int[][] arr)
	 {
		 findPrefixSum(arr);
		 
		 int r = arr.length;
		 int c = arr[0].length;	
		 // traverse vertically to calculate column wise sum
		 for(int j = 0; j < c; j++)
		 {
			 for(int i = 1; i < r; i++)
			 {
				 arr[i][j] += arr[i-1][j]; 
			 }
		 } 
	 }
	 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and cols of matrix : ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
        System.out.println("Enter elements for matrix :");
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Enter rectangle's boundaries l1, r1, l2, r2 : ");
		int l1 = sc.nextInt();
		int r1 = sc.nextInt();
		int l2 = sc.nextInt();
		int r2 = sc.nextInt();

//		int res1 = findRectangleSum1(arr, l1, r1, l2, r2);
//		System.out.println("Rectangle Sum : "+ res1);
		
//		int res2 = findRectangleSum2(arr, l1, r1, l2, r2);
//		System.out.println("Rectangle Sum : "+ res2);
		
		int res3 = findRectangleSum3(arr, l1, r1, l2, r2);
		System.out.println("Rectangle Sum : "+ res3);
		
	}

}
