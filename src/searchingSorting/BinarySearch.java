package searchingSorting;

public class BinarySearch {
	
	// Iterative Approach
	
	static boolean binarySearch(int[] arr, int key)
	{
		int s = 0, e = arr.length;
		if(s > e) return false;
		
		while(s <= e)
		{
			int mid = (s + e)/2;
			if(key == arr[mid])
				return true;
			else if(key > arr[mid])
				s = mid+1;
			else
				e = mid-1;
		}
		return false;
	}
	
	
	// Recursive Approach
	static boolean recBS(int[] arr, int s, int e, int key)
	{
		if(s > e) return false;
		
		int mid = (s+e)/2;
		if(key == arr[mid]) return true;
		else if(key > arr[mid])
		{
			return recBS(arr, mid+1, e, key);
		}
		else
		{
			return recBS(arr, s, mid-1, key);
		}
	}
	

	public static void main(String[] args) {

		int[] arr = {4,6,7,9,11,12};
		int target = 0;
//		System.out.println(binarySearch(arr, 4));
		
		while(target != 13)
		{
			System.out.printf("%d exists in arr : %b \n", target,binarySearch(arr, target));
			System.out.printf("%d exists in arr : %b \n", target,recBS(arr,0, arr.length, target));
			target++;
		}
	}

}
