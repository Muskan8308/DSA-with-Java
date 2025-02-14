package searchingSorting;

public class Q3_Sort012 {
	
	// Q. Given an array of size n containing only 0s, 1s, and 2s, sort the array in ascending order.

	
	// Using Dutch National Flag Algorithm to solve this question
	
	static void swap(int[] arr, int l, int r)
	{
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		
	}
	
	static void sort012(int[] arr)
	{
		int lo = 0, mid = 0 , hi = arr.length-1;
		
		// Explore the unknown region
		while(mid <= hi)
		{
			if(arr[mid] == 0)
			{
				swap(arr, lo, mid);
				lo++;
				mid++;
			}
			else if(arr[mid] == 1)
			{
				mid++;
			}
			else if(arr[mid] == 2)
			{
				swap(arr, mid, hi);
				hi--;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {0, 2, 2, 1, 1, 0, 0, 2, 1};
		
		sort012(arr);
		for(int a : arr)
		{
			System.out.print(a + " ");
			
		}

	}

}
