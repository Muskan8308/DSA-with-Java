import package2.App;			// To import only App class from package2
// import package2.*; 			To importing all class from package2

public class OutsidePkg2 {

	public static void main(String[] args) {

		App obj = new App();
		obj.start();
        System.out.println(obj.str);
		App3 o = new App3();
		o.childClass();
		
	}

}

class App3 extends App 
{
	void childClass()
	{
		App3 b = new App3();
		System.out.println(b.str);
		
	}
	
}