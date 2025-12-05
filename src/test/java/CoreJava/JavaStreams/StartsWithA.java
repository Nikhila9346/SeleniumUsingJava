package CoreJava.JavaStreams;

import java.util.ArrayList;

public class StartsWithA {
	
	//Without Java Streams - to count the elements that starts with A in the ArrayList
		//Iterate through the ArrayList -> if that ele startswithA then increase count by 1
		
		//using Streams 
		//1. Convert the ArrayList to Streams
		//2. Add a intermediate operations on the initial stream to convert it into the another stream
		//3. Perform terminal operation on the final stream to get the output
		
		public static void main(String args[]) {
			
			ArrayList<String> l = new ArrayList<String>();
			l.add("Nikhila");
			l.add("Niharika");
			l.add("Prashu");
			l.add("Uma");
			l.add("Jasmine");
			
			//convert the ArrayList -> Stream, intermediate operation, terminal operation
			//the return type of count is Long
			Long n = l.stream()
					  .filter(s->s.startsWith("N"))
					  .count();
			System.out.print(n);
			
			//print arraylist elements having length > 4
			l.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			
			//print the first 2 names having length>4
			l.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
			
			//alternate way instead of creating ArrayList everytime-only for practice
//			Stream.of("Nikhila", "Niharika", "Prashu", "Uma", "Jasmine").filter(s->s.startsWith("A")).count();
			
		}

}
