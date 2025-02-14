package recursion;
import java.util.Scanner;

public class StringRemoveChar {
	
	// 1st way -> by passing an index to iterate
	
	public static String removeCh(String s, int idx)
	{
		if(idx  == s.length()) return "";
		
		String ans = removeCh(s, idx+1);
		char currChar = s.charAt(idx);
		
		if(currChar != 'a')
			return currChar + ans;
		else
			return ans;
	}
	
	// 2nd way -> by passing directly string without index
	
	static String removeCh2(String s)
	{
		if(s.length() == 0) return "";
		
		String ans = removeCh2(s.substring(1));			// abchad -> bchad ->chad -> had -> ad -> d -> " "
		char curr = s.charAt(0);
		
		if(curr != 'a')
			return curr + ans;
		else
			return ans;
	}
	
	// for both methods -> T.C : O(n2), since concatenating two strings is not a constant time operation, it is a linear time operation i.e O(n). 

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(removeCh(s,0));
		System.out.println(removeCh2(s));
	}

}
