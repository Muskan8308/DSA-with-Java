package Loops_questions;

import java.util.Scanner;

public class A_power_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		
		int ans = 1;
		for(int i = 0; i <= b; i++)
		{
			ans = ans * a;
		}
		System.out.println(a+" raise to the power "+b+" is "+ans);
	}

}
