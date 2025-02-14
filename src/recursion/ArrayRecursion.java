package recursion;

public class ArrayRecursion {
	
	static void printArray(int []arr, int idx)
	{
		if(idx == arr.length)
			return ;
		
		System.out.print(arr[idx] + " ");
		printArray(arr, idx+1);
	}

	public static void main(String[] args) {

		int[] nums = new int[] {5,7,9,3};
		printArray(nums, 0);
	}
}
