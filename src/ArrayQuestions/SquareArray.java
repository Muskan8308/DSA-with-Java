package ArrayQuestions;

public class SquareArray
{
	static int[] squaredSort(int[] arr)
	{
		int n = arr.length;
		int l = 0, r = n-1, k = 0;
		int[] ans = new int[n];
		
		while(l <= r)
		{
			if(Math.abs(arr[l]) > Math.abs(arr[r]))
			{
				ans[k++] = arr[l] * arr[l];
				l++;
			}
			else
			{
				ans[k++] = arr[r] * arr[r];
				r--;
			}
		}
		return ans;
	}
	
	static void reverse(int[] arr)
	{
		int i = 0, j = arr.length-1;
		while(i < j)
		{
			swap(arr, i, j);
			i++; j--;
		}
	}
	
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args)
	{
		int[] nums = {-7,-5,-1,4,8,10};
		System.out.println("Squared Sorted array of given array's sorted elements :- ");
		int ans[] = squaredSort(nums);
		reverse(ans);
		for(int i = 0; i < ans.length; i++)
		{
			System.out.print(ans[i]+ " ");
		}
		
	}
	
}