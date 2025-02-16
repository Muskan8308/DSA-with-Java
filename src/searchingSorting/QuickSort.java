package searchingSorting;

public class QuickSort {
	
	static void swap(int[] arr, int l, int r)
	{
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}
	
	static void displayArr(int[] arr)
	{
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
	}
	
	static void quickSort(int[] arr, int s, int e)
	{
		if(s >= e) return;
		
		int pi = partition(arr, s, e);
		quickSort(arr, s, pi-1);
		quickSort(arr, pi+1, e);
	}
	
	static int partition(int[] arr, int s, int e)
	{
		int pivot = arr[s];
		int eleCnt = 0;
		
		for(int i = s + 1; i <= e; i++)
		{
			if(arr[i] <= pivot)
			eleCnt++;
		}
		
		// Placing pivot at its correct position
		
		int pvIdx = s + eleCnt;
		swap(arr, s, pvIdx);
		
		// Now, placing all smaller elements in the left and greater elements in the right of the pivot.
		
		int i = s, j = e;
		while(i < pvIdx && j > pvIdx)
		{
			while(arr[i] <= pivot) i++;
			while(arr[j] > pivot) j--;
			
			if(i < pvIdx && j > pvIdx)
			{
				swap(arr, i, j);
				i++;
				j--;
			}
				
		}
		
		return pvIdx;
		
	}

	public static void main(String[] args) {

		int []arr = {4,6,6,3,10,10,5,8};
		System.out.println("Array before sorting ");
		displayArr(arr);
		
		quickSort(arr, 0, arr.length-1);
		System.out.println("\nArray after sorting");
		displayArr(arr);
	}

}
