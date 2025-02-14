package ArrayQuestions;
import java.util.*;

// In this program, we have to search q no. of elements (basically q queries) in the array therefore we have introduced a concept of frequency array.
// Hint given in question : This array can store elements upto 10^5, not more than that. 

// So we have created a frequency array of size 10^5 + 1 (since array starts from 0) and when we trace our arr[] array(only once) we increase the value of that index by 1 in the frequency array in which initially have 0 in all indices. And then when we will get queries to search then we simply check our frequency array if the value of that index (which element is asked) is greater than 0 we simply say that this element is present otherwise we say not present.  


public class QueryArray {
	
	static int[] makeFreqArray(int[] arr)
	{
		int[] freq = new int[10005];	// 10^5 + 1 and extra 4 bytes i.e 10005
		
		for(int i = 0; i < arr.length; i++)
		{
			freq[arr[i]] = freq[arr[i]] + 1;		// freq[arr[i]++];
		}
		return freq;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		System.out.print("\nEnter elements : ");
		for(int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		int[] freq = makeFreqArray(nums);
		
		System.out.println("Enter no. of queries : ");
		int q = sc.nextInt();
		
		while(q > 0)
		{
			System.out.print("Enter number to be searched : ");
			int x = sc.nextInt();
			if(freq[x] > 0)
				System.out.println("YES");
			else
				System.out.println("NO");
			q--;
		}
		
	}

}
