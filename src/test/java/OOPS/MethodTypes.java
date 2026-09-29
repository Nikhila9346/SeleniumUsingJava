package OOPS;

public class MethodTypes {
	
	//1) No params  	No return value
	
	void m1()
	{
		System.out.println("Hello..");
	}
		
	//2) No params	Return value
		
	String m2()		{
		return("Hello how are you?");
	}
		
	//3) Takes params	No return value
	void m3(String name)
	{
		System.out.println("Hello "+ name);
	}
		
	//4) Takes params  Retuns value
	String m4(String name)
	{
		return("Hello "+name);
	}

	public static void main(String[] args) {
		
		MethodTypes mt = new MethodTypes();
		mt.m1();
		System.out.println(mt.m2());
		mt.m3("Nikhila");
		System.out.println(mt.m4("Nicks"));

		
	}

}
