package ArrayQuestions;
import java.util.ArrayList;
import java.util.Collections;


public class Arraylis2Reversing {
	
	static void reversingList(ArrayList<Integer> l)
	{
//		How we swap
//		int temp = a; 
//		a = b;
//		b = temp;
		
		int i = 0, j = l.size()-1;
		
		while(i < j)
		{
			Integer temp = Integer.valueOf(l.get(i));
			l.set(i, l.get(j));
			l.set(j, temp);
			i++; j--;
		}
		
	}
	

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(4);
		l1.add(7);
		l1.add(5);
		l1.add(2);
		l1.add(1);
		
		System.out.println("Original List : "+ l1);
		
		reversingList(l1);				// 1st method
		
//		Collections.reverse(l1);		// 2nd way (In-built method present in collections class)
		
		System.out.println("Reversed List : "+ l1);

		
	}

}
