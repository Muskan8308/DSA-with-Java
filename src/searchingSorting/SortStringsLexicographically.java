package searchingSorting;
/*
 * Q. Given an array of names of the fruits. You are supposed to sort it in lexicographically order using selection sort. 
 *  Lexicographical order = Dictionary order 
 *  for example,  • Cat > Coat > Dog
 *  			  • 1 > 10 > 100 > 4 > 50 > 55
 *  
 */
public class SortStringsLexicographically {
	
	static void sortFruits(String[] arr)
	{
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			int minIndex = i;
			for(int j = i+1; j < n; j++)
			{
				if(arr[j].compareTo(arr[minIndex]) < 0)
					minIndex = j;
			}
			String temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void main(String[] args) {

		String[] fruits = {"mango","papaya","kiwi","apple","orange","pear"};
		
		sortFruits(fruits);
		
		for(String val : fruits)
		{
			System.out.print(val + " ");
		}
	}

}
