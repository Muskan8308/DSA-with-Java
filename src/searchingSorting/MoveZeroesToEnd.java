package searchingSorting;

/*
 * Q. Given an integer array, move all 0's to the end of it while maintaining the realtive order of the non-zero elements. Do it in-place.
 */

public class MoveZeroesToEnd {
	
	public static void moveZero(int[] arr)
	{
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			for(int j = 0; j < n-i-1; j++)
			{
				if(arr[j] == 0 && arr[j+1] != 0)
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = {0,2,7,0,4};
		
		moveZero(arr);
		for(int val : arr)
		{
			System.out.print(val +" ");
		}
		
	}

}
