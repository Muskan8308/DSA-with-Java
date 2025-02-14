package ArrayQuestions;

public class TargetTriplets {
	
	int Add(int []arr, int key)
	{
		int n = arr.length;
		int ans = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				for(int k = j+1; k < n; k++)
				{	
					int sum = arr[i] + arr[j] + arr[k];
					if(sum == key)
						ans++;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		TargetTriplets obj = new TargetTriplets();
		int nums[] = {4,6,3,1,5,6,3};
		int target = 13;
		int res = obj.Add(nums, target);
		System.out.println("Total subarray which have the sum as "+target+" are "+res);

	}

}
