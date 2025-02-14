
public class demo {

	public static void main(String[] args) {

		System.out.println("HEllo World!!!");	
		System.out.println(3+5);
		
		int num1 = 6, num2 = 5 ;
		System.out.println(num1 + num2);
		
		int hexnum = 0x7E;		// We can use hexadecimal numbers also.
		System.out.println(hexnum);
		
		int num = 10_00_00_00_00;		// We can use underscore between zeroes in numbers.
		System.out.println(num);
		
		int n = 10;
		
		int s = n%2==0 ? 10 : 20;		// ternary statement
		System.out.println(s);		
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("Day "+i);
			for(int j=9; j>0; j--)
			{
				System.out.println(j+"-"+(j-1));
			}
		}
	}
}
	

