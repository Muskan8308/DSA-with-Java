package searchingSorting;

public class PeakInMountainArray {
	
	// Q. Find the peak index of the array which is like a mountain means at one i, all elements before the i is in ascending order and after the i all elements are in descending order.
	
	
	//	Binary Search approach
	
	static int peakIndex(int[] arr)
	{
		int s = 0, e = arr.length-1;
		int ans = -1;
		while(s <= e)
		{
			int mid = s + (e-s)/2;
			
			if(arr[mid] < arr[mid + 1])
			{
				ans = mid + 1;
				s = mid + 1;
			}
			else
				e = mid - 1;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {2,4,5,6,4,3,1};
		System.out.println(peakIndex(arr));
	}

}
