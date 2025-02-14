package searchingSorting;

public class FirstOcc {
	
	// Find the first occurrence of a number
	
	static int firstOcc(int[] arr, int key)
	{
		int s = 0, e = arr.length-1;
		int fo = -1;
		while(s <= e)
		{
			int mid = s + (e-s)/2;
			if(key == arr[mid])
			{
				fo = mid;
				e = mid - 1;
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
		return fo;
	}

	public static void main(String[] args) {
		int []arr = {5,5,8,8,8,8,10,11,11,23};
		int ans = firstOcc(arr, 9);
		System.out.println(ans);

	}

}
