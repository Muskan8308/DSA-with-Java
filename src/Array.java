
public class Array {

	public static void main(String[] args) {
		// Syntax 1
		int num[] = {3,6,8,2};
		num[1] = 5;
		System.out.println(num[3]);
		System.out.println(num[1]);
		
		// Syntax 2
		int nums[] = new int[3];
		System.out.println(nums[2]);	// By default, all values are zero.
		nums[0] = 2;
		nums[2] = 4;
		nums[1] = 3;
		System.out.println(nums[2]);
		System.out.println(nums[1]);
		
		for(int i=0; i<3; i++)
		{
			System.out.println(nums[i]);
		}
		
		// 2D or Multi-Dimensional Array
		
		int A[][] = new int[3][4];
		// A way to take values as an input from "Math.random()" method in array.
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				A[i][j] = (int)(Math.random() * 10);
			}
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		

}

}
