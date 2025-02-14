package ArrayQuestions;

// Another way to swap two values without using any extra space i.e without any other variable.
public class Swap {
	
	static void swap(int a, int b)
	{
		System.out.print("Original Values : \n"+"a : "+ a+", b : "+ b);
		a = a + b;		// a = 4 + 6 = 10
		b = a - b;		// b = 10 - 4 = 6
		a = a - b;		// a = 10 - 6 = 4
		System.out.print("\nChanged Values : \n"+"a : "+ a+", b : "+ b);

	}

	public static void main(String[] args) {

		//int[] arr = {3,5,7,2,8};
		
		swap(4,6);
		
		
	}

}
