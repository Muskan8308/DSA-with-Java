package searchingSorting;

public class BubbleSort {
	/*
	 *   S.C = O(1);
	 *   T.C = O(n^2)	, in worst case
	 *   T.C = O(n)		, in best case
	 */
	
	// Bubble sort in ascending order
	
	static void sortBubble(int[] a)
	{
		int n = a.length;
		for(int i = 0; i < n-1; i++)
		{
			for(int j = 0; j < n-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	
	// Optimized Code
	// In Ascending Order
	static void bubbleSort(int[]a)
	{
		int n = a.length;
		
		for(int i = 0; i < n-1; i++)
		{
			boolean flag = false;			// flag is used to optimize time complexity in best case 
			for(int j = 0; j < n-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if(!flag)
				return;
		}
	}
	
	// In descending order
	
	static void bubbleDes(int[] a)
	{
		int n = a.length;
		for(int i = 0; i < n-1; i++)
		{
			for(int j = 0; j < n-i-1; j++)
			{
				if(a[j] < a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	
	// Optimized code
	// In Descending Order
	static void bubble(int[] a)
	{
		int n = a.length;
		
		for(int i = 0; i < n-1; i++)
		{
			boolean flag = false;
			for(int j = 0; j < n-i-1; j++)
			{
				if(a[j] < a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if(!flag)
				return;
		}
	}

	public static void main(String[] args) {

		int[] a = {1,3,6,4,2};
		bubbleSort(a);
		for(int i : a)
		{
			System.out.print(i + " ");
		}
		
		bubble(a);
		System.out.println();
		
		for(int i : a)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		sortBubble(a);
		for(int i : a)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
//		bubbleDes(a);
		bubbleSort2(a);
		for(int i : a)
		{
			System.out.print(i + " ");
		}
	}
	
	// practice code 
	
	static void bubbleSort2(int[] arr)
	{
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			boolean flag = true;
			for(int j = 0; j < n-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag)
				return;
		}
	}

}
