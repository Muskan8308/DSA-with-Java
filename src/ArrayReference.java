import java.util.Arrays;
public class ArrayReference {
	
	static void changeFunc(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = 1;
		}
	}

	
	static void print(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+" ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		int[] arr = {54,67,88,32,21};
		System.out.println("Array 1 : ");
		print(arr);
		
		// Taking Reference from an array i.e Copying array 1 to array 2 
		int []arr2 = arr;
		System.out.println("Array 2 (copied from array 1) : ");
		print(arr2);
		
		// Now changing array 2
		
		arr2[0] = 00;
		arr2[1] = 00;
		
		// Now printing both array 
		
		System.out.println("Array 1 after change in array 2: ");
		print(arr);
		
		System.out.println("Array 2 after change in array 2 : ");
		print(arr2);
		
// 		NOTE : Here in the output both array get changed this is because that we have created a reference 		variable which is a copy of existing array, we don't have created a new array in which we copied 		the elements of existing array i.e we didn't allocate new memory. In simple words, the both 		reference variables "arr & arr2(located in the stack memory)" points to the single array located 		in the heap memory. 
//		This is also known as Shallow copy.

// 		The same secenario will repeat if we pass an array to a function which change the value of the 		elements present in the array. This is happened beacause, in java, although here every function 		creates an copy of their parameters(i.e pass by value) but here we are passing an reference 		variable to the function which is located in stack memory and points to the array which is located 		in the heap memory. So, all the operations which are performed in the function will reflect the 		original array.
		
// 		In conclusion, we can say when we pass an parameter(in function) which is located in the stack 		memory, its copy gets created automatically but if parameters are located in heap memory(like 		objects,arrays) and we pass its reference variables then their copy is not created.
		
		System.out.println("Array 2 after change in array 2 : ");
		changeFunc(arr2);
		print(arr2);
	
		// Now, 3 solution for above condition :-
		// 1. Array.clone();	
//		2. Arrays.copyOf(arrayName, arrayLength) 	3. Arrays.copyOfRange(arrName, si, ei)
		
//		By using above 3 methods, we get new memory in the heap memory that means we get two reference 		variables as well as two separate arrays in which the one is original array and another one is 		just the copy of the existing array.
// 		This is called the Deep Copy (We get separate space in the heap memory).		
		
		// int arr3[] = arr.clone();
		//int arr3[] = Arrays.copyOf(arr, arr.length);
		int arr3[] = Arrays.copyOfRange(arr,1,4);

		System.out.println("Array 3 (copied from array 1) : ");
		print(arr3);
		
		arr3[0] = 00;
		arr3[1] = 00;
		
		System.out.println("Array 1 after change in array 3: ");
		print(arr);
		
		System.out.println("Array 3 after change in array 3 : ");
		print(arr3);
		
		
		
	}

}
