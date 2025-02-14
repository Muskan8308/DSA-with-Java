class Add
{
	int num = 3;
	String Calc(int cost)
	{
		if(cost>=1000)
			return "Available";		// If this execute and returns Available then further code inside 									the Calc() will not execute.

		return "Not Available";
	}
	
	
}
public class OOP {

	public static void main(String[] args) {

		
		Add obj1 = new Add();
		Add obj2 = new Add();
		obj2.num = 4;
		System.out.println(obj1.Calc(111));
		System.out.println(obj1.num);
		System.out.println(obj2.num);

	}

}
