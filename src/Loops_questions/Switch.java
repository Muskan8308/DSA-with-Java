package Loops_questions;

public class Switch {

	public static void main(String[] args) {

		String str = " " ;
		
		String exp = "Donkey";
		
		switch(exp)
		{
			case "Dog":
				str = "Bark";
				break;
				
			case "Cat":
				str = "Meow";
				break;
				
			case "Donkey":
				str = "Dhae "
						+ "Chu";
				break;
				
		}
		
		System.out.println(str);
		
		
		int month = 15;
		String season;
		switch(month)
		{
			case 11:
			case 12:
			case 1:
			case 2:
				season = "Winter";
				break;
				
			case 3:
			case 4:
			case 5:
			case 6:
				season = "Summer";
				break;
				
			case 7:
			case 8:
			case 9:
			case 10:
				season = "Rainy";
				break;
				
			default: 
				season = "Invalid";
		}
		
		System.out.println("Season is "+season);
	}

}
