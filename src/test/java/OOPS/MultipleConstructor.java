package OOPS;

public class MultipleConstructor {
int x,y;
	
	
	MultipleConstructor()    // default constructor
	{
		x=10;
		y=20;
	}
	
	MultipleConstructor(int a, int b)    // parameterized constructor
	{
		x=a;
		y=b;
			
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
		
	
	public static void main(String[] args) {
		
		//MultipleConstructor cd=new MultipleConstructor();
		//cd.sum();
		MultipleConstructor cd=new MultipleConstructor(100,200);
		cd.sum();
	}

}

