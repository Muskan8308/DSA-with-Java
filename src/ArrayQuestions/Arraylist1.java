package ArrayQuestions;
import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
// Syntax 														
		// ArrayList<WrapperClass> name = new ArrayList<WrapperClass>(size);
		// Here, after new keyword, wrapper class & size is optional to declare at starting because the size is not fixed it is variable.
		
		ArrayList<Integer> l1 = new ArrayList<>();	// We have created a arraylist of Integer type we can also create of other types like Float, Boolean, Double etc. 
		
		// We can also create a arraylist without defining its type and this arraylist will conatin all types of elements like String, Boolean, Integer etc.
		
		ArrayList l2 = new ArrayList<>();
		
		l2.add("Muskan");
		l2.add(4);
		l2.add(true);
		l2.add(6.7);
		
		System.out.println(l2);
		
		// to add element in list (Elements get added in the end)
		
		l1.add(4);		// 4   size -> 1
		l1.add(5);		// 4 5  size -> 2
		l1.add(2);		// 4 5 2  size -> 3		Size is variable
		l1.add(19);
		l1.add(45);
		
		// to access an element at any index
		
		System.out.println(l1.get(1));		// passing index
		System.out.println(l1.get(4));
		
		
		// to print the arraylist
		// 1st way
		
		for(int i = 0; i < l1.size(); i++)		// here size() method gives the length of arraylist
		{
			System.out.print(l1.get(i) + " ");
		}
		
		// 2nd way
		
		System.out.println("\n"+l1);	// [4, 5, 2, 19, 45]
		
		
		// to add an element at any index
		
		l1.add(2, 10);		// Another method with the same name "add(index,element)".
		System.out.println(l1);

		// to change the value at any index
		
		l1.set(4, 90);
		System.out.println(l1);

		// to delete elements 
		
		l1.remove(4);
		System.out.println(l1);

		
		
		
	}

}
