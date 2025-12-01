package CoreJava;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String args[]) {
		//ArrayList - variable length
		ArrayList<String> list = new ArrayList<String>();
		
		//add values into ArrayList
		list.add("Nikhila");
		list.add("Nishitha");
		
		//get values from the ArrayList
		System.out.print(list.get(0));
		
		//to get size of arraylist
		System.out.println(list.size());
		
		//to check element is present or not
		System.out.println(list.contains("Nikhila"));
		
		
	}
}
