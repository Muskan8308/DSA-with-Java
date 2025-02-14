package recursion;

public class ReverseString {

	// WAY 1 : going right to left (idx--)
	
	static String reverse(String s,int idx)
	{
		if(idx <  0) return "";
		
		String ans = reverse(s, idx-1);
		char curr = s.charAt(idx);
		return curr + ans;
	}
	
	// WAY 2 :  going left to right (idx++)
	
	static String reverse2(String s,int idx)
	{
		if(idx == s.length()) return "";
		
		String ans = reverse2(s, idx+1);
		char curr = s.charAt(idx);
		return ans + curr;
	}
	
	
	// WAY 3 : without passing idx using substring method
	
	static String reverse3(String s)
	{
		if(s.length() ==  0) return "";
		
		String ans = reverse3(s.substring(1));
		char curr = s.charAt(0);
		return ans + curr;
	}
	
	
	public static void main(String[] args) {

		String s = "abacd";
		
		System.out.println(reverse(s, s.length()-1));
		System.out.println(reverse2(s, 0));
		System.out.println(reverse3(s));
	}

}
