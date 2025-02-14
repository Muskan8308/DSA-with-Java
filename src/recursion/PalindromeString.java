package recursion;

public class PalindromeString {
	
	// By using reverse method
	static String reverse(String s,int idx)
	{
		if(idx == s.length()) return "";
		
		String ans = reverse(s, idx+1);
		char curr = s.charAt(idx);
		return ans + curr;
	}

	// Without using reverse method
	
	static Boolean isPalin(String s, int l, int r)
	{
		if(l >= r) return true;
		
		return (s.charAt(l) == s.charAt(r) && isPalin(s, l+1, r-1));
	}
	
	public static void main(String[] args) {

		String s = "LEEL";
		String rev = reverse(s, 0);
		
		if(rev.equals(s))
			System.out.printf("%s is Palindrome", s);
		else
			System.out.printf("%s is Not Palindrome", s);

		System.out.println("\n"+isPalin(s, 0, s.length()-1));
	}

}
