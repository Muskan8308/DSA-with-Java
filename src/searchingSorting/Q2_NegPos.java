package searchingSorting;

public class Q2_NegPos {
	
	// Q. Given an array of +ve and -ve integers, segregate them in linear time and constant space. The output should print all -ve numbers, followed by all +ve numbers.
	
	static void negPos(int[] arr)
	{
		int l = 0, r = arr.length-1;
		while(l < r)
		{
			while(arr[l] < 0) l++;
			while(arr[r] >= 0) r--;
			
			if(l < r)
			{
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = {-1,10,0,3,-5,-6,7,0,2};
		
		negPos(arr);
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
	}

}
