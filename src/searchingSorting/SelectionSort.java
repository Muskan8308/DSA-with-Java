package searchingSorting;

public class SelectionSort {
	/*
	 * T.C -> O(n^2)  S.C -> O(n)
	 */
	
	// Ascending Order
	static void selectSort(int[] a)
	{
		
		int n = a.length;
		for(int i = 0; i < n-1; i++)
		{
			int minIndex = i;
			for(int j = i+1; j < n; j++)
			{
				if(a[j] < a[minIndex])
				{
					minIndex = j;
				}
				
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
	
	// Descending Order
	static void selectionSort(int[] arr)
	{
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++)
		{
			int maxIndex = i;
			for(int j = i+1; j < n; j++)
			{
				if(arr[j] > arr[maxIndex])
					maxIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
	}

	public static void main(String[] args) {

		int[] a = {4,6,8,3,2,9};
		selectionSort(a);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
