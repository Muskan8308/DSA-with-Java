package ArrayQuestions;

public class SecondLargest {
	
	static int findMax(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	static int secondMax(int[] nums)
	{
		int mx = findMax(nums);
		for(int i = 0; i<nums.length; i++)
		{
			if(nums[i] == mx)
				nums[i] = Integer.MIN_VALUE;
		}
		
		int SecondMax = findMax(nums);
		return SecondMax;
	}
	
	
	public static void main(String[] args) {

		//SecondLargest obj = new SecondLargest();
		int nums[] = {0,-5,-7,0,-2};
		
		int res = secondMax(nums);
		System.out.println("Second largest element of the array is "+res);

		
		
	}

}
