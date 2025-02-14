package ArrayQuestions;
 
public class TargetSum {
	
	int Add(int []arr, int key)
	{
		int n = arr.length;
		int ans = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				int sum = arr[i] + arr[j];
				if(sum == key)
					ans++;
			}
		}
		return ans;
	}
	

	public static void main(String[] args) {
		
		TargetSum obj = new TargetSum();
		
		int nums[] = {4,6,3,5,8,2};
		int target = 7;
		int res = obj.Add(nums, 7);
		System.out.println("Total subarray which have the sum as "+target+" are "+res);

	}

}
