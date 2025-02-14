package searchingSorting;

public class MergeSorting {
	
	static void display(int[] arr)
	{
		for(int val : arr) 
			System.out.print(val + " ");
			
	}
	
	
	static void merge(int[] arr, int l, int mid, int r)
	{
		int m = mid-l+1;
		int n = r-mid;
		int i = 0, j = 0, k = l;
		int[] left = new int[m];			// 1st part -> 0 - mid
		int[] right = new int[n];			// 2nd part -> mid+1 - end
		
		for(i = 0; i < m; i++) left[i] = arr[l+i];
		for(j = 0; j < n; j++) right[j] = arr[mid+1+j];
		
		i = 0; j = 0; k = l;
		
		// Filling the "arr" array in sorted manner
		while(i < m && j < n)
		{
			if(left[i] <= right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}
		
		// If some elements of left array is remaining then copy it to original array
		while(i < m)
			arr[k++] = left[i++];
		
		// If some elements of right array is remaining then copy it to original array
		while(j < n)
			arr[k++] = right[j++];
		
	}
	
	static void mergeSort(int[] arr, int l, int r)
	{
		if(l >= r) return ;
		int mid = (l+r)/2;
		
		mergeSort(arr, l , mid);
		mergeSort(arr, mid+1, r);
		merge(arr, l, mid, r);
	}
	
	

	public static void main(String[] args) {
		
		int[] arr = {6,7,3,5,2,8,5,9,1};
		System.out.println("Before sorting");
		display(arr);
		
		System.out.println("\nAfter merge sorting");
		mergeSort(arr, 0, arr.length-1);
		display(arr);
	}
	
	/*
	static void mergeSort(int[] arr, int l, int r)
	{
		if(l >= r) return;
		
		int mid = (l+r)/2;
		
		mergeSort(arr, l, mid);
		mergeSort(arr, mid+1, r);
		merge(arr, l, mid, r);
	}
	
	static void merge(int[] arr, int l, int mid, int r)
	{
		int n1 =  mid - l + 1;
		int n2 = r - mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		int i, j , k;
		
		for(i = 0; i < n1; i++)
			left[i] = arr[l + i];
		
		for(j = 0; j < n2; j++)
			right[j] = arr[mid + 1 + j];
		
		i = 0;
		j = 0;
		k = l;
		while(i < n1 && j < n2)
		{
			if(left[i] <= right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}
		
		while(i < n1)
		{
			arr[k++] = left[i++];
		}
		while(j < n2)
		{
			arr[k++] = right[j++];
		}
	}
	
	*/

}
