package ArrayQuestions;
import java.util.Collections;

import java.util.ArrayList;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		
		l1.add("Muskan");
		l1.add("Komal");
		l1.add("Kanak");
		l1.add("Kamal");
		l1.add("Savita");
		
		System.out.println("Original List : "+ l1);
	
		Collections.sort(l1);		// In-built function
		
		System.out.println("Sorted List in ascending order : "+ l1);

		Collections.sort(l1, Collections.reverseOrder());		// In-built function to reverse the order
		
		System.out.println("Sorted List in descending order : "+ l1);

	}

}
