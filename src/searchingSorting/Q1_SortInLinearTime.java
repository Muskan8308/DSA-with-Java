package searchingSorting;

public class Q1_SortInLinearTime {
	
	// Q. Given an array where all elements are sorted in increasing order except two swapped elements, sort in linear time.
	
	static void sortArr(int[] arr)
	{
		int n = arr.length;
		int x = -1, y = -1;
		
		// Edge case
		if(n <= 0)
			return;
		
		for(int i = 1; i < n; i++)
		{
			if(arr[i-1] > arr[i])
			{
				if(x == -1)			// 1st Conflict
				{
					x = i-1;
					y = i;
				}
				else				// 2nd Conflict
					y = i;
			}
		}
		
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void main(String[] args) {

		int[] arr = {10,3,5,6,7,2};
		
		sortArr(arr);
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
	}

}
