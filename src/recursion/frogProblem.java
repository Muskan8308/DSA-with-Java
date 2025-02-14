package recursion;

/*
 * Q1. There are N stones, numbered 0,1,2...N-1. For each i, the height of stones is hi.There is a frog who is initially on stone 0. He will repeat the following actions to reach stone N-1.
 * If the frog is currently on stone i, jump to stone i+1 or stone i+2. Here a cost of |hi - hj| is incurred, where j is the stone to land on.
 * Find the minimum possible total cost incurred before the frog reaches stone N.
 */

public class frogProblem {
	
	static int best(int[] h, int n, int idx)
	{
		if(idx == n-1) return 0;
		int op1 = Math.abs(h[idx] - h[idx+1]) + best(h, n, idx+1);
		if(idx == n-2) return op1;
		int op2 = Math.abs(h[idx] - h[idx+2]) + best(h, n, idx+2);

		return Math.min(op1, op2);
	}

	public static void main(String[] args) {
		int h[] = {10,30,40,20};
		System.out.println(best(h, h.length, 0));

	}

}
