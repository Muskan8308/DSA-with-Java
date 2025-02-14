package searchingSorting;

public class SearchInRotatedArray {
	
	// Q. Given s sorted rotated array and a target, find the index of the target such that all elements present in the array are distinct.
	
	static int search(int[] arr, int key)
	{
		int s = 0, e = arr.length-1;
		while(s <= e)
		{
			int mid = s + (e-s)/2;
			if(arr[mid] == key)
			{
				return mid;
			}
			else if(arr[mid] < arr[e])			// mid to end is sorted
			{
				if(key > arr[mid] && key <= arr[e])
				{
					s = mid + 1;
				}
				else 
				{
					e = mid - 1;
				}
			}
			else 					// start to mid is sorted
			{
				if(key >= arr[s] && key < arr[mid])
				{
					e = mid - 1;
				}
				else
				{
					s = mid + 1;
				}
			}
		}
		
		return -1;
	}

	
	// Q. Given s sorted rotated array and a target, return any index of the target such that the array contains duplicate elements..
	
	static int searchDupli(int[] arr, int key)
	{
		int s = 0, e  = arr.length-1;
		int firstOcc = -1;			// If we want first occurrence then we'll use this variable
		while(s <= e)
		{
			int mid =  s + (e-s)/2;
			
			if(arr[mid] == key)
			{
				firstOcc = mid;
				e = mid - 1;
//				return mid;
			}
				
			else if(arr[s] == arr[mid] && arr[mid] == arr[e])
			{
				s++;
				e--;
			}
			else if(arr[mid] <= arr[e])
			{
				if(key > arr[mid] && key <= arr[e])
					s = mid + 1;
				else
					e = mid - 1;
			}
			else
			{
				if(key >= arr[s] && key < arr[mid])
					e = mid - 1;
				else
					s = mid  + 1;
			}
		}
		
		return firstOcc;
//		return -1;
	}

	
	
	public static void main(String[] args) {
		
		int[] arr = {4,6,8,9,0,0,0,1,1,1,3};
		int target = 1;
//		System.out.println(search(arr, target));
		System.out.println(searchDupli(arr, target));

	}
}
