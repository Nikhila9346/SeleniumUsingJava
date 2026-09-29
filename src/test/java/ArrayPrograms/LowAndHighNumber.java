package ArrayPrograms;

public class LowAndHighNumber {
	
	public static void main(String args[]) {
		
		int a[] = {10, 20, 30, 40, 50, 15};
		
		int low = a[0], high = a[0];
		
		for(int ele:a) {
			
			if(ele<low) {
				low = ele;
			}
			if(ele>high) {
				high = ele;
			}
		}
		System.out.print(low + " " + high);
	}

}
