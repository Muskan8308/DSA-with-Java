package searchingSorting;

public class SearchIn2dMatrix {
	
	static boolean search2D(int[][] mat, int key)
	{
		/*   
		 * 	n - no. of rows, m - no. of columns
		 * 	
		 * 	Index of an element in 2D array -> r c    i.e 00, 01, 02, 10, 11,...
		 * 
		 *  So r = mid / no. of cols , c = mid % no. of cols
		 * 
		 */
		 
		
		int n = mat.length, m = mat[0].length;
		int s = 0, e = n*m - 1;
		
		while(s <= e)
		{
			int mid = s + (e-s)/2;	
			int midEle = mat[mid / m][mid % m];			
			
			if(midEle == key)
				return true;
			
			else if(key < midEle)
				e = mid - 1;
			
			else
				s = mid + 1;
		}
		
		return false;
	}

	public static void main(String[] args) {

		int[][] mat = {{1,3,4}, {6,8,9}, {10,11,14}};
		int target = 3;
		
		System.out.println(search2D(mat, target));
	}

}
