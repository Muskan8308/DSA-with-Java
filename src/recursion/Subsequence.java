package recursion;
import java.util.ArrayList;

/*
 	Q. Return all subsequences of any string in an array-list, given in a question.
 	
 	Subsequences of n numbers is 2^n i.e subsequence(3) = 2^3 = 8.
 	
 	sub("abc") = ["", a, b, ab, c, ac, bc, abc ]
 	
 	Here we are using an array list. And in this approach the length of array list is increasing exponentially (since sub(n) = 2^n).
 	Due to which, Space Complexity = O(2^n). 
 
*/

public class Subsequence {
	
	static ArrayList<String> getSSQ(String s)
	{
		ArrayList<String> ans = new ArrayList<>();
		
		// base case
		
		if(s.length() == 0)
		{
			ans.add("");
			return ans;
		}
		
		// recursive work
		
		char curr = s.charAt(0);
		ArrayList<String> smallAns = getSSQ(s.substring(1));
		
		// self work
		
		for(String ss : smallAns)
		{
			ans.add(ss);
			ans.add(curr + ss);
		}
		
		return ans;
	}
	
	

	public static void main(String[] args) {

		String s = "abc";
		System.out.println(getSSQ(s));		// ["", "a", "b", "ab", "c", "ac", "bc", "abc"]
		
		ArrayList<String> ans = getSSQ(s);
		for(String ss : ans)
		{
			System.out.println(ss);
		}
	}

}
