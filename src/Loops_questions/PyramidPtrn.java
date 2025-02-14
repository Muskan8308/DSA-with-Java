package Loops_questions;
import java.util.Scanner;

public class PyramidPtrn {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(), c = sc.nextInt();
		
		for(int i = 1; i <= r ; i++)
		{
			// printing spaces
			for(int j = 1; j <= r-i; j++)
			{
				System.out.print(" ");
			}
			
			// printing stars
			for(int k = 1; k <= 2*i-1 ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
