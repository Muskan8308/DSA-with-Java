package recursion;

public class MaxElement {
	
	static int findMax(int[] arr, int idx)
	{
		if(idx == arr.length-1)
			return arr[idx];
			
		int smallAns = findMax(arr, idx+1);
		return Math.max(arr[idx], smallAns);
	}

	public static void main(String[] args) {

		int[] nums = new int[] {5,7,19,3};
		System.out.println(findMax(nums, 0));
	}

}
