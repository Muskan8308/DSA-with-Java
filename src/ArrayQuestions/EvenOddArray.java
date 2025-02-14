package ArrayQuestions;

public class EvenOddArray {
	
	// In this problem, the relative order of even and odd numbers doesn't matter. All even no. is placed before the all odd numbers irrespective of their order(ascending or descending).
	
	static int[] sortEvenOdd(int[] arr)
	{
		int n = arr.length;
		int l = 0, r = n-1;
		while(l < r)
		{
			if((arr[l] % 2 != 0) && (arr[r] % 2 == 0))
			{
				swap(arr, l, r);
				l++; r--;
			}
			
			if(arr[l] % 2 == 0)
				l++;
			
			if(arr[r] % 2 != 0)
				r--;
		}
		return arr;
	}
	
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		int[] nums = {1,20,4,7,34,5,12,60,77,11};
		System.out.println("Sorted array of even and odd elements :- ");

		sortEvenOdd(nums);
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+ " ");
		}
		
	}

}
