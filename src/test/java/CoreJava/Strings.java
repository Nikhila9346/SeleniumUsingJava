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
		String s4 = new String("  Welcome ");
		
		//length
		System.out.println(s1.length());
		
		//concat
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1+s2);
		
		//trim
		System.out.println("Before trimming length"+ s4.length());
		String s5 = s4.trim();
		System.out.println("After trimming length"+ s5.length());
		
		//charAt(i)
		System.out.println("The character at 2nd index  " + s1.charAt(2));
		
		//contains()
		System.out.println("Selenium contains "+s1.contains("ele"));
		
		//equals()
		System.out.println(s1.equals(s2));
		
		//replace
		String name = "Welcome to Java Selenium Class";
		System.out.println("Replace  "+name.replace("Class", "class"));
		
		//substring(start, end)
		System.out.println("Substring  "+ name.substring(11, 15));
		
		//toUpperCase(), toLowerCase()
		System.out.println("Upper Case:  "+name.toUpperCase());
		System.out.println("Upper Case:  "+name.toLowerCase());
		
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
