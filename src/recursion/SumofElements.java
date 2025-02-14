package recursion;

public class SumofElements {
	
	// Done by myself :) 
	
	static int sum(int[] arr, int i)
	{
		 if(i == arr.length) return 0;
//		if(i == arr.length-1) return arr[i];		//base case
		
		int sum = sum(arr, i + 1);		// recursive call
		return sum + arr[i];			// self work
	}

	public static void main(String[] args) {
		
		int[] nums = new int[] {2,3,5,20,1};
        System.out.println(sum(nums, 0));
	}

}
