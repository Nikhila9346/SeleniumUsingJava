package StringPrograms;

import java.util.HashMap;

public class CountCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "automation";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char ele:a.toCharArray()) {
			hm.put(ele, hm.getOrDefault(ele, 0)+1);
		}
		System.out.println(hm);

	}

}
