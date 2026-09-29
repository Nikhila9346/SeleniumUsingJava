package StringPrograms;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "automation";
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			if(result.indexOf(str.charAt(i)) == -1) {
				result = result+str.charAt(i);
			}
		}
		System.out.print(result);

	}

}
