package recursion;

public class isSort_recursion {
	
	static Boolean isSort(int[]arr, int idx)
	{
		if(idx == arr.length - 1)
			return true;
		
		if(arr[idx] > arr[idx + 1])
			return false;
		
		return isSort(arr, idx+1);
	}

	public static void main(String[] args) {

		int[] a = {3,5,7,9,19};
		
		if(isSort(a,0))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
