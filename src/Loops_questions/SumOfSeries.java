// Sum of n number of Series...
package Loops_questions;
import java.util.*;

public class SumOfSeries {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		
		int num = 0;
		for(int i=1; i<=n; i++)
		{
			if(i%2 == 0)
			{
				num -= i;	//even
			}
			else
			{
				num += i;	// odd
			}
		}
		System.out.println("Sum of the Series is "+num);
	}

}
