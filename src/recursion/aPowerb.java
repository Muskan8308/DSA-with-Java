package recursion;

public class aPowerb {
	
	// 1st way, 		T.C = O(q)	S.C = O(q)
	static int prod(int p, int q)
	{
		if(q == 0) return 1;
		
		return prod(p,q-1) * p;
	}
	
	// 2nd optimized way,			T.C = O(log q) 
	static int pow(int p, int q)
	{
		if(q == 0) return 1;

		int ans = pow(p,q/2);
		
		if(q % 2 == 0)			// q is Even 
			return ans * ans;
		else					// q is odd
			return ans * ans * p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println(prod(2,8));
        System.out.println(pow(5,5));
	}

}
