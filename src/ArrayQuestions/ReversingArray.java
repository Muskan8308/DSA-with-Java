package ArrayQuestions;

public class ReversingArray {
	
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	// 2nd way : Using inplace algorithm i.e all the changes done in the same array without taking any extra space. 
	static int[] inPlaceArray(int[] arr)
	{
		int j = arr.length - 1;
		for(int i = 0; i < j; i++)
		{
			swap(arr, i, j);
			j--;
		}
		
		return arr;
	}
	
	
	// 1 way : By using extra space i.e a new array 
	static int[] reverseArray(int []arr)
	{
		int n = arr.length;
		int[] nums = new int[n];
		int j = 0;
		for(int i = n-1; i >= 0; i--)
		{
			nums[j++] = arr[i];
		}

		return nums;
	}
	

	public static void main(String[] args) {

		int arr[] = {3,6,23,66,90};
		//int ans[] = reverseArray(arr);
		
		int ans[] = inPlaceArray(arr);
		
		for(int i = 0; i < ans.length; i++)
		{
			System.out.print(ans[i]+" ");
		}
		
	}

}
