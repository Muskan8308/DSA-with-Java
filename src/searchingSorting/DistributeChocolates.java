package searchingSorting;

public class DistributeChocolates {
	
	
	static boolean isDivPossible(int[] a, int m, int maxChocoAllowed)
	{
		int numOfStudents = 1;
		int choco = 0;							// no. of choco that a student has
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > maxChocoAllowed) return false;
			if(choco + a[i] <= maxChocoAllowed)
			{
				choco += a[i];
			}
			else
			{
				numOfStudents++;
				choco = a[i];
			}
		}
		
		if(numOfStudents > m) return false;
		return true;
		
//		return numOfStudents <= m;
	}
	
	static int distributeChoco(int[] a, int m)
	{
		if(a.length < m) return -1;			// no. of boxes < no of students
		
		int ans = 0, s = 1, e = (int)1e9;
		
		while(s <= e)
		{
			int mid =  s + (e-s)/2;
			
			if(isDivPossible(a, m, mid))	// Checking that division is possible or not 
			{
				ans = mid;
				e = mid - 1;
			}
			else
			{
				s =  mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] arr = {12,34,67,90};
		int m = 2;
		System.out.println(distributeChoco(arr, m));
		
	}

}
