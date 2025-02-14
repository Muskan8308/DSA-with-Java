package searchingSorting;

public class SearchRotatedArray {
	
	// Find the minimum (pivot) element in the rotated sorted array  
	
	static int findMin(int[] arr)
	{
		int n = arr.length;
		int s = 0, e = n-1;
		int ans = -1;
		
		while(s <= e)
		{
			int mid =  s + (e-s)/2;
			
			if(arr[mid] <= arr[n-1])
			{
				ans = mid;
				e = mid - 1;
			}
			else
				s = mid + 1;
		}
		
		return ans;
	}

	public static void main(String[] args) {

		int []arr = {4,5,7,8,10,1,2,3};
		System.out.println(findMin(arr));
	}

}
