package recursion;

public class LinearSearch {
	
// Searching an element by using recursion, is an target element is present or not.

	static boolean search(int[] arr, int target, int idx)
	{
		if(idx == arr.length)
			return false;
		
		if(arr[idx] == target)
			return true;
		
		return search(arr, target, idx+1);
	}
	
	// findFirstIndex -> this will return the first index of the target if it is present.
	
	static int findIndex(int[] arr, int target, int idx)
	{
		if(idx == arr.length)
			return -1;
		
		if(arr[idx] == target)
			return idx;
		
		return findIndex(arr, target, idx+1);
	}
	
	// findAllIndex -> this will print all the index of the target where it is present.

	static void findAllIndex(int[]arr, int target, int idx)
	{
		if(idx == arr.length) return;
		
		if(arr[idx] == target)
			System.out.print(idx + " ");
		
		findAllIndex(arr, target, idx+1);
	}
	
	// findLastIndex -> this will return the last index of the target if it is present.
	
	static int findLastIndex(int[] arr, int target, int idx)
	{
		if(idx < 0)
			return -1;
		
		if(arr[idx] == target)
			return idx;
		
		 return findLastIndex(arr, target, idx-1);
		  
	}
	
	public static void main(String[] args) {

		int[] nums = {4,8,56,83,83,8,3,8,9};
		
		if(search(nums, 83, 0))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		System.out.println(findIndex(nums, 8, 0));
		
		findAllIndex(nums, 8, 0);
		
		System.out.println(findLastIndex(nums, 83, nums.length-1));

	}

}
