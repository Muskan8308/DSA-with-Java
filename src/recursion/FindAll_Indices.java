package recursion;
import java.util.ArrayList;

public class FindAll_Indices {
	
	static ArrayList<Integer> allIndices(int[]arr, int target, int idx)
	{
		if(idx >= arr.length)
			return new ArrayList<Integer>();		// empty array list
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		if(arr[idx] == target)
			ans.add(idx);
		
		ArrayList<Integer> smallAns = allIndices(arr, target, idx+1);
		ans.addAll(smallAns);
		
		return ans;
	}

	public static void main(String[] args) {

		int[] a = {4,3,6,7,3,2,3,3};
		ArrayList<Integer> ans = allIndices(a, 3, 0);
		for(Integer i : ans)
		{
			System.out.print(i + " ");
		}
	}

}
