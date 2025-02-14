package ArrayQuestions;

public class RepeatingNumber {
	
	// This function gives the first repeated element
	static int firstSame(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[i] == nums[j])
					return nums[i];
			}
		}
		return -1;
	}
	
	// This function gives the no. of repeating elements
	static int findSame(int[] nums)
	{
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[i] == nums[j])
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int nums[] = {4,4,3,5,3,2};
		System.out.println("Total no. of duplicate elements : "+findSame(nums));
		System.out.println("First repeating value : "+firstSame(nums));

		
	}

}
