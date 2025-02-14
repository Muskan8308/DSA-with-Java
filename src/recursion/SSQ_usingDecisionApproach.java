package recursion;

/*
 * Q. To print all subsequences of the given string without using 2^n space.
 *  
 * Here we are using INCLUSION-EXCLUSION approach -> In this, we make a choice to be a part of string i.e INCLUSION and a choice not to be a part of string i.e EXCLUSION
 * Here S.C = O(n^2)
 */

public class SSQ_usingDecisionApproach {
	
	static void printSSQ(String s, String currAns)
	{
		if(s.length() == 0)
		{
			System.out.print("\"" + currAns + "\" ");
			return;
		}
		
		char curr = s.charAt(0);
		String remString = s.substring(1);
		
		printSSQ(remString, currAns + curr);	// current char (curr) chooses to be a part of string -> INCLUSION
		printSSQ(remString, currAns);			// current char (curr) not chooses to be a part of string -> EXCLUSION

	}

	public static void main(String[] args) {

		printSSQ("abc", "");
	}

}
