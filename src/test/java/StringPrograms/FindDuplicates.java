package StringPrograms;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "automation";
		
		for(int i=0; i<a.length(); i++) {
			for(int j=i+1; j<a.length(); j++) {
				if((a.charAt(i)) == (a.charAt(j))) {
					System.out.println(a.charAt(i));
				}
			}
		}

	}

}
