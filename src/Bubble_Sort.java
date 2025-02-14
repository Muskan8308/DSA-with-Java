// BUBBLE SORT 

class Bubble
{
	void sorting(int A[],int n)
	{
		for(int i=0; i<=n-1; i++)
		{
			int ptr = 0;
			while(ptr < n-i-1)
			{
				if(A[ptr] > A[ptr+1])
				{
					swap(A, ptr, ptr+1);
				}
				ptr++;
			}
		}
	}
	
	void swap(int arr[], int m, int n)
	{
		int temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
	}
}

public class Bubble_Sort {
	public static void main(String[] args)
	{
		int nums[] = {23,54,67,12,32,20};
		Bubble b = new Bubble();
		b.sorting(nums, nums.length);
		for(int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}

}
