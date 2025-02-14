package ArrayQuestions;

// Prefix sum or running sum problem

public class PrefixSum {
	
	// 1st way 
	
	// Brute Force Approach (Basic approach)
	static int[] pref(int[] arr)
	{
		int newArr[] = new int[arr.length]; 
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			newArr[i] = sum;
		}
		return newArr;
	}
	
	// 2nd way
	
	static int[] run(int[] arr)
	{
		// If we create a new array
		
//		int newArr[] = new int[arr.length]; 
//		newArr[0] = arr[0];
		
		// If we do change in the same array
		for(int i = 1; i < arr.length; i++)
		{
			// newArr[i] = newArr[i-1] + arr[i];
			 
			arr[i] = arr[i-1] + arr[i];
		}
		return arr;
	}

	static void print(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		int[] nums = {6,8,4,0,2};
		int idx = 0;
		System.out.println("Array :-");
		print(nums);
		int newNums[] = run(nums);   //pref(nums);
		System.out.println("Prefix sum of above array :- ");
		print(newNums);
	}
}
