package ArrayQuestions;
import java.util.Scanner;

// Rotate the array 
public class RotateArray {
	
	// without any extra space i.e inPlace
	
	static int[] rotateArray(int[] arr, int k)
	{
		int n = arr.length;
		k = k % n;
		for(int i = n-k; i < n; i++)
		{
			
		}
		return arr;
	}
	
	// with extra space - 1st way 
	static int[] rotate(int[] arr, int k)
	{
		int n = arr.length;
		k = k % n;
		int[] ans = new int[n]; 
		int j = 0; 
		
		for(int i = n-k; i < n; i++)
		{
			ans[j++] = arr[i];
		}
		
		for(int i = 0; i < n-k; i++)
		{
			ans[j++] = arr[i];
		}
		return ans;
	}
	

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int n = obj.nextInt();
		
		int[] nums = new int[n];
		System.out.print("Enter elements : ");
		for(int i = 0; i < n; i++)
		{
			nums[i] = obj.nextInt();
		}
		
		System.out.println("Enter k : ");
		int k = obj.nextInt();
		
		System.out.println("Rotated array :-");
		int[] ans = rotate(nums,k);
		for(int i = 0; i<n; i++)
		{
			System.out.print(ans[i]+" ");
		}
	}

}
