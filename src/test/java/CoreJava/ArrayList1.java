package CoreJava;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String args[]) {
		//ArrayList - It is a class which implements List Interface, variable length, duplicates are accepted, 
		ArrayList<String> list = new ArrayList<String>();
		
		//add values into ArrayList - 2ways 
		list.add("Nikhila");
		list.add("Nishitha");
		list.add(2, "Nikhil");
		
		//get values from the ArrayList
		System.out.print(list.get(0));
		
		//to get the index of a value
		System.out.println(list.indexOf("Nikhil"));
		
		//remove the values
		list.remove(0);
		list.remove("Nikhila");
		list.removeAll(list);
		
		//to get size of arraylist
		System.out.println(list.size());
		
		//to check element is present or not
		System.out.println(list.contains("Nikhila"));
		
		//isEmpty()
		System.out.println(list.isEmpty());
		
	}
}
