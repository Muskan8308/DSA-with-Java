package searchingSorting;

public class CountSort {
	
	// Basic Approach due which it is not stable i.e Stability is lost. 
	
	static void basicCountSort(int[] arr)
	{
		// find maximum element
		
		int maxi = 0;
		for(int a : arr)
		{
			maxi = Math.max(a, maxi);
		}
		
		// create a frequency array with the maximum element
		
		int[] freq = new int[maxi+1];
		
		for(int i = 0; i < arr.length; i++)
		{
			freq[arr[i]]++; 
		}
		
		// override the array with sorted elements
		
		 int k = 0;
		 
		 for(int i = 0; i < freq.length; i++)
		 {
			 for(int j = 0; j < freq[i]; j++)
			 {
				 arr[k++] = i;
			 }
		 }
		
	}
	
	static void display(int[] arr)
	{
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
	}

	// 2nd way - Stable approach
	
	static void countSort(int[] arr)
	{
		int n = arr.length;
		int[] output = new int[n];
		
		// find maximum element
		int maxi = 0;
		for(int a : arr)
		{
			maxi = Math.max(a, maxi);
		}
		
		
		// create a frequency array with the maximum element
		int[] count = new int[maxi+1];
		
		for(int i = 0; i < arr.length; i++)
		{
			count[arr[i]]++; 
		}
		
		
		// Make prefix sum array of count array
		for(int i = 1; i < count.length; i++)
		{
			count[i] += count[i-1]; 
		}
		
		
		// Find the index of each element in the original array and put it in output array
		for(int i = n-1; i >= 0; i--)
		{
			int idx = count[arr[i]] - 1;
			output[idx] = arr[i];
			count[arr[i]]--;
		}
		
		
		// copy all elements of output array to arr
		for(int i = 0; i < n; i++)
			arr[i] = output[i];
	
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,6,7,2,6,3,9,1};
		
		System.out.println("Before Sorting");
		display(arr);

//		basicCountSort(arr);
		countSort(arr);
		System.out.println("\nAfter Sorting");
		display(arr);

	}

}
