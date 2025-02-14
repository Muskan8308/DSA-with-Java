package searchingSorting;

public class FindPeakIndex {
	
	/*
	 Q. A peak element is an element that is strictly greater than its neighbors.
		Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
		You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array
	 */
	
	static int findPeakIdx(int[] arr)
	{
		int n = arr.length;
		int s = 0, e =  n-1;
		
		while(s <= e)
		{
			int mid = s + (e-s)/2;
			if((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == n-1 || arr[mid] > arr[mid + 1]))
			{
				return mid;
			}
				
			else if (arr[mid] < arr[mid+1]) // going uphill/ ascending 
				s =  mid + 1;
			else
				e = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 1};
		System.out.println(findPeakIdx(arr));
	}

}
