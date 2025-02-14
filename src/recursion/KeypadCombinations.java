package recursion;

public class KeypadCombinations {

	static void combinations(String dig, String res, String[] kp)
	{
		if(dig.length() == 0)
		{
			System.out.print(res + " ");
			return;
		}
		int curNum = dig.charAt(0) - '0'; // to convert character to an integer
		String curChoices = kp[curNum];
		
		for(int i = 0; i < curChoices.length(); i++)
		{
			combinations(dig.substring(1), res + curChoices.charAt(i), kp);
		}
		
	}
	
	public static void main(String[] args) {
		String s = "253";
		
		String[] kp = {"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		// 				0	1	2	  3	  	4	  5		6		7	 8		9
		
		combinations(s, "", kp);
	}

}
