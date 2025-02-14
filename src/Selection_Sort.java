// SELECTION SORT :)
class Sort
{
	void swap(int A[], int a, int b)
	{
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
		
	}
	
	void sorting(int arr[], int k)
	{	
		for(int i=1; i<k; i++)
		{
			int min = arr[i], loc = i;
			for(int j=i+1; j<k; j++)
			{
				if(min > arr[j])
				{ 
					min = arr[j];
					loc = j;
				}
			}
			swap(arr, i, loc);
		}
	}
}
public class Selection_Sort {

	public static void main(String[] args) {

		int[] nums = {45,76,23,65,40,50};
		Sort obj = new Sort();
		System.out.println("Selected array by using Selection sort :-");
		obj.sorting(nums,nums.length);
		System.out.print("\t[");
		for(int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i]+(i<nums.length-1 ? ", " : ""));
		}
		System.out.print("]");

	}

}
