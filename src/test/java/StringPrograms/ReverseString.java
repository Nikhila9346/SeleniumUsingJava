package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Welcome";
		String rev = "";
		
		//Method 1 - using charAt(), length()
		
		for(int i=s.length()-1; i>=0; i--) {
			
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		
		//Method 2 - using toCharArray()
		
		/*char a[] = s.toCharArray();
		
		for(int i=a.length-1; i>=0; i--) {
			
			rev = rev + a[i];
		}
		
		System.out.println(rev);*/
		
		//Method 3
		StringBuffer a = new StringBuffer("Welcomme");
		System.out.println(a.reverse());
		
		//Method 4
		StringBuilder a1 = new StringBuilder("Welcome");
		System.out.println(a1.reverse());
	}

}
