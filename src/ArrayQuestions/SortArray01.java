package ArrayQuestions;

public class SortArray01 {
	
	// 1st Approach : traversing same array two times.
	static void sortZeroesAndOne(int[] arr)
	{
		int n = arr.length;
		int zeroes = 0;
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == 0)
			zeroes++;
		}
		
		for(int i = 0; i < n; i++)
		{
			if(i < zeroes)
				arr[i] = 0;
			else
				arr[i] = 1;
		}
	}
	
	// 2nd Approach : Using two pointers and traversing only once.
	static void sort01(int[] arr)
	{
		int n = arr.length;
		int left = 0, right = n-1;
		
		while(left < right)
		{
			if(arr[left] == 1 && arr[right] == 0)
			{
				swap(arr, left, right);
				left++; right--;
			}
			
			if(arr[left] == 0)
				left++;
			if(arr[right] == 1)
				right--;
		}
		
	}
	
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		int[] nums = {1,0,0,0,1,1,1,0,0,1};
		System.out.println("Sorted array of 0-1 elements :- ");
		//sortZeroesAndOne(nums);
		sort01(nums);
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+ " ");
		}
		
	}

}
