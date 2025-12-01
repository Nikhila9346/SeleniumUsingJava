package CoreJava;

public class Strings {
	public static void main(String args[]) {
		
		//String is an object, which represents the sequence of characters
		//2 ways of defining a String: String Literal and new Keyword
		
		//String Literal
		String s1 = "Selenium";
		String s2 = "Selenium";
		
		//new Keyword - creates new object everytime
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		//split the array
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim());
		
		//iterating the string
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		//reverse the string - IQ
	}
}
