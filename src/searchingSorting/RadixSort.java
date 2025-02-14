package searchingSorting;

public class RadixSort {
	/*
	 * 		T.C  →  O(d(n+k))  ≈  O(d.n)           where d is the no. of digits in the maximum no. present in the array.
	 * 		S.C  →  O(n)
	 */
	
	static void display(int[] arr)
	{
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
	}

	static int findMax(int []arr)
	{
		int maxi = 0;
		for(int a : arr)
		{
			maxi = Math.max(a, maxi);
		}
		
		return maxi;
	}
	
	static void countSort(int[] arr, int place)
	{
		int n = arr.length;
		int[] output = new int[n];
		int[] count = new int[10];
		
		// fill freq array
		
		for(int i = 0; i < arr.length; i++)
		{
			count[(arr[i] / place) % 10]++;
		}
		
		// Make prefix sum array of count array
		for(int i = 1; i < count.length; i++)
		{
			count[i] += count[i-1];
		}
	
		// find the index of each element in the original array and put it in output array
		for(int i = n-1; i >= 0; i--)
		{
			int idx = count[(arr[i]/place) % 10] - 1;
			output[idx] = arr[i];
			count[(arr[i]/place) % 10]--;
		}
		
		// copy all ele of output to arr
		for(int i = 0; i < n; i++)
		{
			arr[i] = output[i];
		}
	}
	
	static void radixSort(int[] arr)
	{
		int max = findMax(arr);			// get maximum element
		
		// apply count sort to sort elements based on place value
		for(int place = 1; max/place > 0; place *= 10)
		{
			countSort(arr, place);
		}
		
	}
	

	public static void main(String[] args) {

		int[] arr = {56,89,2,2,4,555,765};
		System.out.println("Before Sorting");
		display(arr);

		radixSort(arr);
		System.out.println("\nAfter Sorting");
		display(arr);
	}

}
