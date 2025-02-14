package searchingSorting;

public class InsertionSort {
	
	// Ascending Order
	private static void insertSort(int[] a)
	{
		for(int i = 1; i < a.length; i++)
		{
			int j = i;
			while(j > 0 && a[j] < a[j-1])
			{
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				j--;
			}
		}
	}
	
	
	// Descending order
	
	static void insert(int[] a)
	{
		for(int i = 1; i < a.length; i++)
		{
			int j = i;
			while(j > 0 && a[j] > a[j-1])
			{
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = {5,6,2,9,4};
		
		insertionSort(arr);
		for(int val : arr)
		{
			System.out.print(val + " ");
		}
		
		System.out.println();
		insert(arr);
		for(int val : arr)
		{
			System.out.print(val + " ");
		}
	}
	
	// For practice rewrite it 
	static void insertionSort(int[] a)
	{
		int n = a.length;
		for(int i = 1; i < n; i++)
		{
			int j = i;
			while(j > 0 && a[j] < a[j-1])
			{
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				j--;
			}
		}
	}

}
