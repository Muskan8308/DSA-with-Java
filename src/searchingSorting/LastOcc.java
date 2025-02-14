package searchingSorting;

public class LastOcc {
	
	// Find the last occurrence of a number
	
	static int lastOcc(int[] arr, int key)
	{
		int s = 0, e = arr.length-1;
		int lo = -1;
		while(s <= e)
		{
			int mid = s + (e-s)/2;
			if(key == arr[mid])
			{
				lo = mid;
				s = mid + 1;
			}
			else if(key > arr[mid])
			{
				s = mid+1;
			}
			else 
			{
				e = mid-1;
			}
		}
		return lo;

	}

	public static void main(String[] args) {
		int []arr = {5,5,8,8,8,8,10,11,11,23};
		int ans = lastOcc(arr, 10);
		System.out.println(ans);
	}

}
